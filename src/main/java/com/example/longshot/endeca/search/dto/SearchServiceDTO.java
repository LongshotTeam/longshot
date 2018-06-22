package com.example.longshot.endeca.search.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class SearchServiceDTO {

    private String prefetch;

    private String sId;

    private String statusCode;

    private String statusMessage;

    private List<String> errors;

    private String keyword;

    private String storeId;

    private String autoCorrectedTerm;

    private String didYouMeanTerm;

    private String isHookLogicInsert;

    private String totalResult;

    private String currentPage;

    private String resultsStartIndex;

    private String resultsEndIndex;

    private String maxPages;

    private List<Items> items;

    private List<Facets> facets;

    private String mediaContent;

    private String useKeywordAsIcon;
    
    private String algoName;
    
    private String relevance;

    public String getRelevance() {
		return relevance;
	}

	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}

	public String getAlgoName() {
        return algoName;
    }

    public void setAlgoName(String algoName) {
        this.algoName = algoName;
    }

    public void setPrefetch(String prefetch) {
        this.prefetch = prefetch;
    }

    public String getPrefetch() {
        return this.prefetch;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getSId() {
        return this.sId;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getErrors() {
        return this.errors;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setAutoCorrectedTerm(String autoCorrectedTerm) {
        this.autoCorrectedTerm = autoCorrectedTerm;
    }

    public String getAutoCorrectedTerm() {
        return this.autoCorrectedTerm;
    }

    public void setDidYouMeanTerm(String didYouMeanTerm) {
        this.didYouMeanTerm = didYouMeanTerm;
    }

    public String getDidYouMeanTerm() {
        return this.didYouMeanTerm;
    }

    public void setIsHookLogicInsert(String isHookLogicInsert) {
        this.isHookLogicInsert = isHookLogicInsert;
    }

    public String getIsHookLogicInsert() {
        return this.isHookLogicInsert;
    }

    public void setTotalResult(String totalResult) {
        this.totalResult = totalResult;
    }

    public String getTotalResult() {
        return this.totalResult;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getCurrentPage() {
        return this.currentPage;
    }

    public void setResultsStartIndex(String resultsStartIndex) {
        this.resultsStartIndex = resultsStartIndex;
    }

    public String getResultsStartIndex() {
        return this.resultsStartIndex;
    }

    public void setResultsEndIndex(String resultsEndIndex) {
        this.resultsEndIndex = resultsEndIndex;
    }

    public String getResultsEndIndex() {
        return this.resultsEndIndex;
    }

    public void setMaxPages(String maxPages) {
        this.maxPages = maxPages;
    }

    public String getMaxPages() {
        return this.maxPages;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public List<Items> getItems() {
        return this.items;
    }

    public void setFacets(List<Facets> facets) {
        this.facets = facets;
    }

    public List<Facets> getFacets() {
        return this.facets;
    }

    public void setMediaContent(String mediaContent) {
        this.mediaContent = mediaContent;
    }

    public String getMediaContent() {
        return this.mediaContent;
    }

    public void setUseKeywordAsIcon(String useKeywordAsIcon) {
        this.useKeywordAsIcon = useKeywordAsIcon;
    }

    public String getUseKeywordAsIcon() {
        return this.useKeywordAsIcon;
    }
}
