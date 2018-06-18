package com.example.longshot.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.longshot.model.response.AllCases;
import com.example.longshot.model.response.CasesResponse;

@Component
public class CasesBiz {
	
	public CasesResponse getCasess(){
		
		CasesResponse caseResp = new CasesResponse();
		List<AllCases> cases = new ArrayList<>();
		AllCases case1 = new AllCases();
		case1.setCaseName("Movie Search");
		case1.setCaseNo(1001);
		case1.setLastTry(1);
		case1.setOwned(true);
		cases.add(case1);
		caseResp.setCasesCount(1);
		caseResp.setAllCases(cases);
		return caseResp;
	}
}
