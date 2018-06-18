package com.example.longshot.jsonconverter;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.example.longshot.model.response.SearchResult;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JSONReader {
    public SearchResult readJsonWithObjectMapper(String algo) throws IOException {
        
        ObjectMapper objectMapper = new ObjectMapper();
        SearchResult searchRes = null;
        
        if(algo.equalsIgnoreCase("algo1"))
            searchRes = objectMapper.readValue(new File("C:/app/Longshot/json/product1.json"), SearchResult.class);
        else if(algo.equalsIgnoreCase("algo2"))
            searchRes = objectMapper.readValue(new File("C:/app/Longshot/json/product2.json"), SearchResult.class);
        else 
            searchRes = objectMapper.readValue(new File("C:/app/Longshot/json/product3.json"), SearchResult.class);
       
        return searchRes;
    }
}
