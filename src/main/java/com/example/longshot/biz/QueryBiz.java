package com.example.longshot.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.example.longshot.jsonconverter.JSONReader;
import com.example.longshot.model.reqest.ReqQuery;
import com.example.longshot.model.reqest.SearchQuery;
import com.example.longshot.model.response.AddQueryReponse;
import com.example.longshot.model.response.QueryDto;
import com.example.longshot.model.response.SearchResult;

@Component
public class QueryBiz {

    @Autowired
    public JSONReader jsonReader;
    
    public AddQueryReponse addQuery(ReqQuery query) {
        AddQueryReponse queryReponse = new AddQueryReponse();
        List<Integer> displayOrder = new ArrayList<>();
        displayOrder.add(1001);
        displayOrder.add(1002);
        queryReponse.setDisplayOrder(displayOrder);

        QueryDto queryDto = new QueryDto();
        queryDto.setArrangedAt(0);
        queryDto.setArrangedNext(512409557);
        queryDto.setQuery_text("query_text");
        queryReponse.setQuery(queryDto);

        return queryReponse;
    }

    public SearchResult searchQuery(SearchQuery query, String qString) {

        System.out.println(qString);
        SearchResult queryResponse = new SearchResult();
        if (query.getQueryText() != null || qString.equals("milk")){
           
            try{
            if(/**query.getRelAlgo().size()== 0|| */ qString.equals("milk")) {
                    return jsonReader.readJsonWithObjectMapper(qString);
             } else if(query.getRelAlgo().contains("Algo1")){
                     return jsonReader.readJsonWithObjectMapper(qString);
             } else{
                     return jsonReader.readJsonWithObjectMapper(qString);
             }
            }catch(Exception exe){
                exe.printStackTrace();
            }
        }else {
            queryResponse.setErrorCode("NO_SEARCH_TERM_1001");
            queryResponse.setErrorDescription("Please enter your search keyword");
            queryResponse.setStatus(HttpStatus.OK.getReasonPhrase());
        }
        return queryResponse;
    }
    
    
}
