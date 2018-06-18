package com.example.longshot.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CasesResponse {

	private List<AllCases> allCases;

    private int casesCount;

    public void setAllCases(List<AllCases> allCases){
        this.allCases = allCases;
    }
    public List<AllCases> getAllCases(){
        return this.allCases;
    }
    public void setCasesCount(int casesCount){
        this.casesCount = casesCount;
    }
    public int getCasesCount(){
        return this.casesCount;
    }
}
