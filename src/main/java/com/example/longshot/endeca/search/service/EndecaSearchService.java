package com.example.longshot.endeca.search.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.longshot.configs.Configs;
import com.example.longshot.endeca.search.dto.SearchServiceDTO;

@Component
public class EndecaSearchService {
    
    //Call endeca PROD API and return the json result
    public SearchServiceDTO getResult(String responsetype, String keyword, String storeid, String productperpage, int pagenum ){
        
        RestTemplate restTemplate = new RestTemplate();
        StringBuilder normalEndcaURL = new StringBuilder();
        normalEndcaURL.append(Configs.endecaURL);
        
        if(responsetype!=null)
            normalEndcaURL.append("responsetype=").append(responsetype);
           
         normalEndcaURL.append("&keyword=").append(keyword)
         .append("&storeid=").append(storeid)
         .append("&productperpage=").append(productperpage)
         .append("&pagenum=").append(1);
         
        ResponseEntity<SearchServiceDTO> response = restTemplate.getForEntity(normalEndcaURL.toString(), SearchServiceDTO.class);
        
        return response.getBody();
    }

}
