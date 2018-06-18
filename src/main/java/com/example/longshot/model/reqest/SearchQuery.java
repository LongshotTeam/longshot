package com.example.longshot.model.reqest;

import java.util.List;

public class SearchQuery {

    private String queryText;
    private List<ReqQuery> relAlgo;
    
    public String getQueryText() {
        return queryText;
    }
    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }
    public List<ReqQuery> getRelAlgo() {
        return relAlgo;
    }
    public void setRelAlgo(List<ReqQuery> relAlgo) {
        this.relAlgo = relAlgo;
    }
    
}
