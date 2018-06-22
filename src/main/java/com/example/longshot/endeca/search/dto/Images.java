package com.example.longshot.endeca.search.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Images
{
    private String largeImage;

    private List<String> smallImage;

    private String thumbnailImage;

    public void setLargeImage(String largeImage){
        this.largeImage = largeImage;
    }
    public String getLargeImage(){
        return this.largeImage;
    }
    public void setSmallImage(List<String> smallImage){
        this.smallImage = smallImage;
    }
    public List<String> getSmallImage(){
        return this.smallImage;
    }
    public void setThumbnailImage(String thumbnailImage){
        this.thumbnailImage = thumbnailImage;
    }
    public String getThumbnailImage(){
        return this.thumbnailImage;
    }
}