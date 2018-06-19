package com.example.longshot.model.reqest;

public class SearchQuery {

    private String responsetype;
    private String keyword;
    private String storeid;
    private String productperpage;
    private int pagenum;
    
    //private List<String> relAlgo;
    
    public int getPagenum() {
        return pagenum;
    }
    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }
    public String getResponsetype() {
        return responsetype;
    }
    public void setResponsetype(String responsetype) {
        this.responsetype = responsetype;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String getStoreid() {
        return storeid;
    }
    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }
    public String getProductperpage() {
        return productperpage;
    }
    public void setProductperpage(String productperpage) {
        this.productperpage = productperpage;
    }
    
    
    /*public List<String> getRelAlgo() {
        return relAlgo;
    }
    public void setRelAlgo(List<String> relAlgo) {
        this.relAlgo = relAlgo;
    }*/
    
   
    
}
