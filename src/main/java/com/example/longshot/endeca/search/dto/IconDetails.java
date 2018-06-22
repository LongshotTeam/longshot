package com.example.longshot.endeca.search.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class IconDetails {
    private List<String> promotionalIcons;

    private List<String> informationalIcons;

    public void setPromotionalIcons(List<String> promotionalIcons) {
        this.promotionalIcons = promotionalIcons;
    }

    public List<String> getPromotionalIcons() {
        return this.promotionalIcons;
    }

    public void setInformationalIcons(List<String> informationalIcons) {
        this.informationalIcons = informationalIcons;
    }

    public List<String> getInformationalIcons() {
        return this.informationalIcons;
    }
}