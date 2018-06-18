package com.example.longshot.model.response;

public class QueryDto {
	private int arrangedAt;

    private int arrangedNext;

    private String deleted;

    private int queryId;

    private String query_text;

    private String scorerEnbl;

    private String scorerId;

    private String threshold;

    private String thresholdEnabled;

    private String options;

    public void setArrangedAt(int arrangedAt){
        this.arrangedAt = arrangedAt;
    }
    public int getArrangedAt(){
        return this.arrangedAt;
    }
    public void setArrangedNext(int arrangedNext){
        this.arrangedNext = arrangedNext;
    }
    public int getArrangedNext(){
        return this.arrangedNext;
    }
    public void setDeleted(String deleted){
        this.deleted = deleted;
    }
    public String getDeleted(){
        return this.deleted;
    }
    public void setQueryId(int queryId){
        this.queryId = queryId;
    }
    public int getQueryId(){
        return this.queryId;
    }
    public void setQuery_text(String query_text){
        this.query_text = query_text;
    }
    public String getQuery_text(){
        return this.query_text;
    }
    public void setScorerEnbl(String scorerEnbl){
        this.scorerEnbl = scorerEnbl;
    }
    public String getScorerEnbl(){
        return this.scorerEnbl;
    }
    public void setScorerId(String scorerId){
        this.scorerId = scorerId;
    }
    public String getScorerId(){
        return this.scorerId;
    }
    public void setThreshold(String threshold){
        this.threshold = threshold;
    }
    public String getThreshold(){
        return this.threshold;
    }
    public void setThresholdEnabled(String thresholdEnabled){
        this.thresholdEnabled = thresholdEnabled;
    }
    public String getThresholdEnabled(){
        return this.thresholdEnabled;
    }
    public void setOptions(String options){
        this.options = options;
    }
    public String getOptions(){
        return this.options;
    }
}
