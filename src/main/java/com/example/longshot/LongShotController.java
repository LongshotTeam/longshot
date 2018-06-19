package com.example.longshot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.longshot.biz.CasesBiz;
import com.example.longshot.biz.QueryBiz;
import com.example.longshot.endeca.search.dto.SearchServiceDTO;
import com.example.longshot.model.reqest.ReqQuery;
import com.example.longshot.model.reqest.SearchQuery;
import com.example.longshot.model.response.AddQueryReponse;
import com.example.longshot.model.response.CasesResponse;

@Controller
public class LongShotController implements Longshot {

    @Autowired
    private CasesBiz casesBiz;

    @Autowired
    private QueryBiz queryBiz;

    @Override
    public String rank() {
        return "Welcome to LongShot team";
    }

    @Override
    public String publish(String message) {
        return "publishy7";
    }

    @Override
    public ResponseBody tuneRelevance() {
        return null;
    }

    @Override
    public ResponseBody importRatings() {
        return null;
    }

    @Override
    public ResponseBody takeSnapshot() {
        return null;
    }

    @Override
    public ResponseBody selectCustomScorers() {
        return null;
    }

    @Override
    public ResponseBody updateSettings() {
        return null;
    }

    @Override
    public CasesResponse casess() {
        return casesBiz.getCasess();
    }

    @Override
    public AddQueryReponse addQuery(@RequestBody ReqQuery query) {
        return queryBiz.addQuery(query);
    }

    @Override
    public SearchServiceDTO searchQuery(@RequestBody SearchQuery query) {
        return queryBiz.searchQuery(query);
    }

}
