package com.example.longshot.endeca.search.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Facets {
    private String facetName;

    private String value;

    private String displayName;

    private String itemCount;

    public void setFacetName(String facetName) {
        this.facetName = facetName;
    }

    public String getFacetName() {
        return this.facetName;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }

    public String getItemCount() {
        return this.itemCount;
    }
}