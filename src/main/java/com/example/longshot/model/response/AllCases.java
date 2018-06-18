package com.example.longshot.model.response;

public class AllCases {

	private String caseName;

	private int caseNo;

	private boolean owned;

	private int lastTry;

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public String getCaseName() {
		return this.caseName;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}

	public int getCaseNo() {
		return this.caseNo;
	}

	public void setOwned(boolean owned) {
		this.owned = owned;
	}

	public boolean getOwned() {
		return this.owned;
	}

	public void setLastTry(int lastTry) {
		this.lastTry = lastTry;
	}

	public int getLastTry() {
		return this.lastTry;
	}
}
