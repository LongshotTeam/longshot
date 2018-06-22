package com.example.longshot.biz;

/**
 * This class represents a relevance judgment of a particular document for a
 * specific query.
 */

 public class Judgment {
	/**
	 * Constructs a new Judgment instance.
	 *
	 * @param documentNumber
	 *            The document identifier.
	 * @param judgment
	 *            The relevance judgment for this document, where positive
	 *            values mean relevant, and zero means not relevant.
	 */
	public Judgment(String itemNumber, int judgment) {
		this.itemNumber = itemNumber;
		this.judgment = judgment;
	}

	/** The document identifier. */
	public String itemNumber;
	/**
	 * The relevance judgment for this document, where positive values mean
	 * relevant, and zero means not relevant.
	 */
	public int judgment;
}
