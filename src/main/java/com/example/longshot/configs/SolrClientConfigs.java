package com.example.longshot.configs;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Component;

@Component
public class SolrClientConfigs {

    public Float solrConfig() throws Exception, IOException{
        String urlString = "http://localhost:8983/solr/TestCore";
        HttpSolrClient solr = new HttpSolrClient(urlString); //new HttpSolrClient.Builder(urlString).build();
        QueryResponse resp = null;
        
        
        SolrQuery query = new SolrQuery();  
        query.setQuery("*:*");  
        query.add("sku_id","78095395");
        ///select?facet=on&q=sku_id:
        
        //Adding the field to be retrieved 
        
        //Executing the query 
        QueryResponse response = solr.query(query);
        SolrDocumentList results = response.getResults();
        //results.getMaxScore();
        for (int i = 0; i < results.size(); ++i) {
            System.out.println(results.get(i));
            response.getFacetFields();
        }
        
        return results.getMaxScore();
    }
}
