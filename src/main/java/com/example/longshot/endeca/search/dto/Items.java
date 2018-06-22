package com.example.longshot.endeca.search.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Items
{
    private String shelfId;
    
    private float score;

    private float rank;

    private String shelfName;

    private String deptId;

    private String deptName;

    private String isBundle;

    private String meatStickerDetails;

    private String extraLargeImageURL;

    private String bundledItemCount;

    private String scene7Host;

    private String cin;

    private String promoDetailFull;

    private String availability;

    private String totalReviewCount;

    private String asdaSuggest;

    private String itemName;

    private String price;

    private String imageURL;

    private String aisleName;

    private String id;

    private String promoId;

    private String isFavourite;

    private String hasAlternates;

    private String wasPrice;

    private String brandName;

    private String promoType;

    private String weight;

    private String promoOfferTypeCode;

    private String productAttribute;

    private String scene7AssetId;

    private String promoDetail;

    private String bundleDiscount;

    private String avgStarRating;

    private Images images;

    private String name;

    private String avgWeight;

    private IconDetails iconDetails;

    private String maxQty;

    private String pricePerWt;

    private String productURL;

    private String pricePerUOM;

    public void setShelfId(String shelfId){
        this.shelfId = shelfId;
    }
    public String getShelfId(){
        return this.shelfId;
    }
    public void setShelfName(String shelfName){
        this.shelfName = shelfName;
    }
    public String getShelfName(){
        return this.shelfName;
    }
    public void setDeptId(String deptId){
        this.deptId = deptId;
    }
    public String getDeptId(){
        return this.deptId;
    }
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
    public String getDeptName(){
        return this.deptName;
    }
    public void setIsBundle(String isBundle){
        this.isBundle = isBundle;
    }
    public String getIsBundle(){
        return this.isBundle;
    }
    public void setMeatStickerDetails(String meatStickerDetails){
        this.meatStickerDetails = meatStickerDetails;
    }
    public String getMeatStickerDetails(){
        return this.meatStickerDetails;
    }
    public void setExtraLargeImageURL(String extraLargeImageURL){
        this.extraLargeImageURL = extraLargeImageURL;
    }
    public String getExtraLargeImageURL(){
        return this.extraLargeImageURL;
    }
    public void setBundledItemCount(String bundledItemCount){
        this.bundledItemCount = bundledItemCount;
    }
    public String getBundledItemCount(){
        return this.bundledItemCount;
    }
    public void setScene7Host(String scene7Host){
        this.scene7Host = scene7Host;
    }
    public String getScene7Host(){
        return this.scene7Host;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCin(){
        return this.cin;
    }
    public void setPromoDetailFull(String promoDetailFull){
        this.promoDetailFull = promoDetailFull;
    }
    public String getPromoDetailFull(){
        return this.promoDetailFull;
    }
    public void setAvailability(String availability){
        this.availability = availability;
    }
    public String getAvailability(){
        return this.availability;
    }
    public void setTotalReviewCount(String totalReviewCount){
        this.totalReviewCount = totalReviewCount;
    }
    public String getTotalReviewCount(){
        return this.totalReviewCount;
    }
    public void setAsdaSuggest(String asdaSuggest){
        this.asdaSuggest = asdaSuggest;
    }
    public String getAsdaSuggest(){
        return this.asdaSuggest;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return this.itemName;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getPrice(){
        return this.price;
    }
    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }
    public String getImageURL(){
        return this.imageURL;
    }
    public void setAisleName(String aisleName){
        this.aisleName = aisleName;
    }
    public String getAisleName(){
        return this.aisleName;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setPromoId(String promoId){
        this.promoId = promoId;
    }
    public String getPromoId(){
        return this.promoId;
    }
    public void setIsFavourite(String isFavourite){
        this.isFavourite = isFavourite;
    }
    public String getIsFavourite(){
        return this.isFavourite;
    }
    public void setHasAlternates(String hasAlternates){
        this.hasAlternates = hasAlternates;
    }
    public String getHasAlternates(){
        return this.hasAlternates;
    }
    public void setWasPrice(String wasPrice){
        this.wasPrice = wasPrice;
    }
    public String getWasPrice(){
        return this.wasPrice;
    }
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }
    public String getBrandName(){
        return this.brandName;
    }
    public void setPromoType(String promoType){
        this.promoType = promoType;
    }
    public String getPromoType(){
        return this.promoType;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight;
    }
    public void setPromoOfferTypeCode(String promoOfferTypeCode){
        this.promoOfferTypeCode = promoOfferTypeCode;
    }
    public String getPromoOfferTypeCode(){
        return this.promoOfferTypeCode;
    }
    public void setProductAttribute(String productAttribute){
        this.productAttribute = productAttribute;
    }
    public String getProductAttribute(){
        return this.productAttribute;
    }
    public void setScene7AssetId(String scene7AssetId){
        this.scene7AssetId = scene7AssetId;
    }
    public String getScene7AssetId(){
        return this.scene7AssetId;
    }
    public void setPromoDetail(String promoDetail){
        this.promoDetail = promoDetail;
    }
    public String getPromoDetail(){
        return this.promoDetail;
    }
    public void setBundleDiscount(String bundleDiscount){
        this.bundleDiscount = bundleDiscount;
    }
    public String getBundleDiscount(){
        return this.bundleDiscount;
    }
    public void setAvgStarRating(String avgStarRating){
        this.avgStarRating = avgStarRating;
    }
    public String getAvgStarRating(){
        return this.avgStarRating;
    }
    public void setImages(Images images){
        this.images = images;
    }
    public Images getImages(){
        return this.images;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAvgWeight(String avgWeight){
        this.avgWeight = avgWeight;
    }
    public String getAvgWeight(){
        return this.avgWeight;
    }
    public void setIconDetails(IconDetails iconDetails){
        this.iconDetails = iconDetails;
    }
    public IconDetails getIconDetails(){
        return this.iconDetails;
    }
    public void setMaxQty(String maxQty){
        this.maxQty = maxQty;
    }
    public String getMaxQty(){
        return this.maxQty;
    }
    public void setPricePerWt(String pricePerWt){
        this.pricePerWt = pricePerWt;
    }
    public String getPricePerWt(){
        return this.pricePerWt;
    }
    public void setProductURL(String productURL){
        this.productURL = productURL;
    }
    public String getProductURL(){
        return this.productURL;
    }
    public void setPricePerUOM(String pricePerUOM){
        this.pricePerUOM = pricePerUOM;
    }
    public String getPricePerUOM(){
        return this.pricePerUOM;
    }
    
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    public float getRank() {
        return rank;
    }
    public void setRank(float rank) {
        this.rank = rank;
    }
}