package com.example.longshot.jsonconverter;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.longshot.endeca.search.dto.ItemRankComparator;
import com.example.longshot.endeca.search.dto.ItemScoreComparator;
import com.example.longshot.endeca.search.dto.Items;
import com.example.longshot.endeca.search.dto.SearchServiceDTO;
import com.example.longshot.model.reqest.SearchQuery;
import com.example.longshot.model.response.AddQueryReponse;
import com.example.longshot.model.response.SearchResult;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JSONReader {
    public SearchResult readJsonWithObjectMapper(String algo) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        SearchResult searchRes = null;

        if (algo.equalsIgnoreCase("algo1"))
            searchRes = objectMapper.readValue(new File("C:/app/Longshot/json/product1.json"), SearchResult.class);
        else if (algo.equalsIgnoreCase("algo2"))
            searchRes = objectMapper.readValue(new File("C:/app/Longshot/json/product2.json"), SearchResult.class);
        else
            searchRes = objectMapper.readValue(new File("C:/app/Longshot/json/product3.json"), SearchResult.class);
        return searchRes;
    }

    public AddQueryReponse addSerchTermInSolr(String searchTerm) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        AddQueryReponse searchRes = null;

        if (searchTerm != null)
            searchRes = objectMapper.readValue(new File("C:/app/Longshot/json/searchTermResponse.json"),
                    AddQueryReponse.class);
        return searchRes;
    }

    public SearchServiceDTO readJsonWithObjectMapperDemo(SearchQuery query) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        SearchServiceDTO searchRes = null;

        //Default (No re-Reank)
        if (query.getResponsetype() == null) {
            if (query.getKeyword().equalsIgnoreCase("milk"))
                searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/milk_Default.json"),
                        SearchServiceDTO.class);
            else if (query.getKeyword().equalsIgnoreCase("bread"))
                searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/bread_Default.json"),
                        SearchServiceDTO.class);
            else if (query.getKeyword().equalsIgnoreCase("tomoto"))
                searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/tomoto_Default.json"),
                        SearchServiceDTO.class);
            else if (query.getKeyword().equalsIgnoreCase("banana"))
                searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/banana_Default.json"),
                        SearchServiceDTO.class);
        }
        
        //Clickstream_Constant_Threshold
        else if (query.getKeyword().equalsIgnoreCase("milk") && query.getResponsetype().equalsIgnoreCase("algo1"))
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/milk_algo1.json"), SearchServiceDTO.class);
        else if (query.getKeyword().equalsIgnoreCase("bread") && query.getResponsetype().equalsIgnoreCase("algo1"))
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/bread_algo1.json"),
                    SearchServiceDTO.class);
        else if (query.getKeyword().equalsIgnoreCase("tomoto") && query.getResponsetype().equalsIgnoreCase("algo1")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/tomoto_algo1.json"), SearchServiceDTO.class);
        }
        else if (query.getKeyword().equalsIgnoreCase("banana") && query.getResponsetype().equalsIgnoreCase("algo1")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/banana_algo1.json"), SearchServiceDTO.class);
        }
        
      //Clickstream Relative  Threshold
        else if (query.getKeyword().equalsIgnoreCase("banana") && query.getResponsetype().equalsIgnoreCase("algo2")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/banana_algo2.json"),
                    SearchServiceDTO.class);
        }
        else if (query.getKeyword().equalsIgnoreCase("bread") && query.getResponsetype().equalsIgnoreCase("algo2")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/bread_algo2.json"),
                    SearchServiceDTO.class);
        }
        else if (query.getKeyword().equalsIgnoreCase("tomoto") && query.getResponsetype().equalsIgnoreCase("algo2")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/tomoto_algo2.json"),
                    SearchServiceDTO.class);
        }
        else if (query.getKeyword().equalsIgnoreCase("milk") && query.getResponsetype().equalsIgnoreCase("algo2")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/milk_algo2.json"),
                    SearchServiceDTO.class);
            
        //Merchadizing Boost Bury Rules
        }else if (query.getKeyword().equalsIgnoreCase("bread") && query.getResponsetype().equalsIgnoreCase("assembler")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/bread_Boost.json"),
                    SearchServiceDTO.class);
        } else if (query.getKeyword().equalsIgnoreCase("banana") && query.getResponsetype().equalsIgnoreCase("assembler")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/banana_Boost.json"), SearchServiceDTO.class);
        }
        else if (query.getKeyword().equalsIgnoreCase("tomoto") && query.getResponsetype().equalsIgnoreCase("assembler")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/tomoto_Boost.json"), SearchServiceDTO.class);
        }else if (query.getKeyword().equalsIgnoreCase("milk") && query.getResponsetype().equalsIgnoreCase("assembler")) {
            searchRes = objectMapper.readValue(new File("C:/app/Longshot1/json/milk_Boost.json"), SearchServiceDTO.class);
        }
        
        List<Items> itemList = searchRes.getItems();
        Collections.sort(itemList, new ItemScoreComparator());// Sort by score
        Collections.sort(itemList, new ItemRankComparator());// Sort by Rank
        searchRes.setItems(itemList);
        return searchRes;
    }
}
