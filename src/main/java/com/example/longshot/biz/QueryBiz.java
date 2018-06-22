package com.example.longshot.biz;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.example.longshot.endeca.search.dto.SearchServiceDTO;
import com.example.longshot.endeca.search.service.EndecaSearchService;
import com.example.longshot.jsonconverter.JSONReader;
import com.example.longshot.model.reqest.ReqQuery;
import com.example.longshot.model.reqest.SearchQuery;
import com.example.longshot.model.response.AddQueryReponse;

@Component
public class QueryBiz {

    @Autowired
    public JSONReader jsonReader;

    @Autowired
    public EndecaSearchService endecaSearchService;

    /**
     * Post a search term to solr
     * 
     * @param query
     * @return
     */
    public AddQueryReponse addQuery(ReqQuery query) {
        AddQueryReponse queryReponse = new AddQueryReponse();
        queryReponse.setStatus(HttpStatus.OK.getReasonPhrase());
        if (query.getSearchTerm() != null)
            try {
                return jsonReader.addSerchTermInSolr(query.getSearchTerm());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        else {
            queryReponse.setErrorCode("No_SEARCH_TERM_AVAILABLE");
            queryReponse.setErrorDescription("please enter your search term");
        }
        return queryReponse;
    }

    /**
     * Return solr search result
     * 
     * @param query
     * @return
     */
    public SearchServiceDTO searchQuery(SearchQuery query) {

        SearchServiceDTO queryResponse = new SearchServiceDTO();
        // queryResponse.setStatus(HttpStatus.OK.getReasonPhrase());
        if (query != null && query.getResponsetype() != null) {
            try {
                return endecaSearchService.getResult(query.getResponsetype(), query.getKeyword(), query.getStoreid(),
                        query.getProductperpage(), query.getPagenum());
                // return
                // jsonReader.readJsonWithObjectMapper(query.getQueryText());
            }
            catch (Exception exe) {
                exe.printStackTrace();
            }
        }
        else {
            return endecaSearchService.getResult(null, query.getKeyword(), query.getStoreid(),
                    query.getProductperpage(), query.getPagenum());
            // return jsonReader.readJsonWithObjectMapper(query.getQueryText());
        }

        return queryResponse;
    }

    /**
     * Return solr search result
     * 
     * @param query
     * @return
     */
    public SearchServiceDTO searchQueryDemo(SearchQuery query) {
        SearchServiceDTO searchDto = null;
        
        try {
            return jsonReader.readJsonWithObjectMapperDemo(query);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return searchDto;
    }

}
