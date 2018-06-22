package com.example.longshot.biz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Collection;
import com.example.longshot.biz.Item;
import com.example.longshot.biz.Judgment;


public class Evaluator {
	
    @Autowired
    private Item item;

    @Autowired
     private Judgment judgment;

	 private String _queryName;
	 private ArrayList<Item> _retrieved;
	 private HashMap<String, Judgment> _judgments;
	 private int _numIrrelevant;
	 private ArrayList<Item> _judgedMissed;
	 private ArrayList<Item> _relevant;
	 private ArrayList<Item> _relevantRetrieved;
	 private ArrayList<Item> _judgedIrrelevantRetrieved;
	 private ArrayList<Item> _irrelevantRetrieved;
	 private ArrayList<Item> _relevantMissed;
	 
	 
	public Evaluator( String queryName, List<Item> retrieved, Collection<Judgment> judgments ) {
		         _queryName = queryName;
		         _retrieved = new ArrayList<Item>( retrieved );
		         _buildJudgments( judgments );
		         
	}
	
	private void _buildJudgments(Collection<Judgment> judgments) {
		_judgments = new HashMap<String, Judgment>();
		_numIrrelevant = 0;
		for (Judgment judgment : judgments) {
			_judgments.put(judgment.itemNumber, judgment);
			// count total number of judged irrelevant for bpref.
			if (judgment.judgment <= 0)
				_numIrrelevant++;
		}
	}

	/**
	 * <p>
	 * Normalized Discounted Cumulative Gain
	 * </p>
	 *
	 * 
	 * Score = N \sum_i (2^{r(i)} - 1) / \log(1 + i)
	 *
	 * Where N is such that the score cannot be greater than 1. We compute this
	 * by computing the DCG (unnormalized) of a perfect ranking.
	 * 
	 * @return the normalized discounted cumulative gain (ndcg).
	 */
	public double normalizedDiscountedCumulativeGain() {
		return normalizedDiscountedCumulativeGain(Math.max(_retrieved.size(), _judgments.size()));
	}

	public double normalizedDiscountedCumulativeGain(int documentsRetrieved) {
		// first, compute the gain from an optimal ranking
		double normalizer = normalizationTermNDCG(documentsRetrieved);

		if (normalizer == 0)
			return 0;

		// now, compute the NDCG of the ranking and return that
		double dcg = 0;
		List<Item> truncated = _retrieved;

		if (_retrieved.size() > documentsRetrieved)
			truncated = _retrieved.subList(0, documentsRetrieved);

		for (Item document : truncated) {
			Judgment judgment = _judgments.get(document.itemNumber);

			if (judgment != null && judgment.judgment > 0) {
				dcg += (Math.pow(2, judgment.judgment) - 1.0) / Math.log(1 + document.rank);
			}
		}

		return dcg / normalizer;
	}

	protected double normalizationTermNDCG(int documentsRetrieved) {
		TreeMap<Integer, Integer> relevanceCounts = new TreeMap<Integer, Integer>();

		// the normalization term represents the highest possible DCG score
		// that could possibly be attained. we compute this by taking the
		// relevance
		// judgments, ordering them by relevance value (highly relevant
		// documents first)
		// then calling that the ranked list, and computing its DCG value.
		// we use negative judgment values so they come out of the map
		// in order from highest to lowest relevance

		for (Judgment judgment : _judgments.values()) {
			if (judgment.judgment == 0)
				continue;

			if (!relevanceCounts.containsKey(-judgment.judgment)) {
				relevanceCounts.put(-judgment.judgment, 0);
			}

			relevanceCounts.put(-judgment.judgment, relevanceCounts.get(-judgment.judgment) + 1);
		}

		double normalizer = 0;
		int documentsProcessed = 0;

		for (Integer negativeRelevanceValue : relevanceCounts.keySet()) {
			int relevanceCount = (int) relevanceCounts.get(negativeRelevanceValue);
			int relevanceValue = -negativeRelevanceValue;
			relevanceCount = Math.min(relevanceCount, documentsRetrieved - documentsProcessed);

			for (int i = 1; i <= relevanceCount; i++) {
				normalizer += (Math.pow(2, relevanceValue) - 1.0) / Math.log(1 + i + documentsProcessed);
			}

			documentsProcessed += relevanceCount;
			if (documentsProcessed >= documentsRetrieved)
				break;
		}
		return normalizer;
	}
	
    /**
     * @return the name of the query represented by this evaluator.
     */
    public String queryName() {
        return _queryName;
    }
    
    /**
     * @return The list of retrieved documents.
     */
    public ArrayList<Item> retrievedDocuments() {
        return _retrieved;
    }
    
    /**
     * @return The list of all documents retrieved that were explicitly judged irrelevant.
     */
    
    public ArrayList<Item> judgedIrrelevantRetrievedDocuments() {
        return _judgedIrrelevantRetrieved;
    }
    
    /**
     * This method returns a list of all documents that were retrieved
     * but assumed to be irrelevant.  This includes both documents that were
     * judged to be irrelevant and those that were not judged at all.
     * The list is returned in retrieval order.
     * @return the list of all retrieved irrelevant documents.
     */
    public ArrayList<Item> irrelevantRetrievedDocuments() {
        return _irrelevantRetrieved;
    }
    
    /**
     * Returns a list of retrieved documents that were judged relevant,
     * in the order that they were retrieved.
     * @return the list of all retrieved relevant documents
     */
    public ArrayList<Item> relevantRetrievedDocuments() {
        return _relevantRetrieved;
    }
    
    /**
     * Returns a list of all documents judged relevant, whether they were
     * retrieved or not.  Documents are listed in the order they were retrieved,
     * with those not retrieved coming last.
     * @return the list of all relevant documents 
    */
    public ArrayList<Item> relevantDocuments() {
        return _relevant;
    }
    
    /**
     * Returns a list of documents that were judged relevant that
     * were not retrieved.
     * @return the relevant documents that were missed by the search engine
     */
    public ArrayList<Item> relevantMissedDocuments() {
        return _relevantMissed;
    }
}
