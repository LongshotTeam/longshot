package com.example.longshot.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AddQueryReponse {

    private QueryDto query;
    private List<Integer> displayOrder;
    private String status;
    private String errorCode;
    private String errorDescription;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public void setQuery(QueryDto query) {
        this.query = query;
    }

    public QueryDto getQuery() {
        return this.query;
    }

    public void setDisplayOrder(List<Integer> displayOrder) {
        this.displayOrder = displayOrder;
    }

    public List<Integer> getDisplayOrder() {
        return this.displayOrder;
    }
}
