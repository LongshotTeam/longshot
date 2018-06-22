package com.example.longshot.biz;

public class Item {
	/**
	 * Constructs a new Document object.
	 *
	 * @param documentNumber
	 *            The document identifier.
	 * @param rank
	 *            The rank of the document in a retrieved ranked list.
	 * @param score
	 *            The score given to this document by the retrieval system.
	 */

	public Item(String itemNumber, int rank, double score) {
		this.itemNumber = itemNumber;
		this.rank = rank;
		this.score = score;
	}

	/**
	 * Constructs a new Document object.
	 *
	 * @param documentNumber
	 *            The document identifier.
	 */

	public Item(String itemNumber) {
		this.itemNumber = itemNumber;
		this.rank = Integer.MAX_VALUE;
		this.score = Double.NEGATIVE_INFINITY;
	}

	/** The rank of the document in a retrieved ranked list. */
	public int rank;
	/** The document identifier. */
	public String itemNumber;
	/** The score given to this document by the retrieval system. */
	public double score;
}

