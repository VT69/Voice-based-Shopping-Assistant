package com.assistant.shopping.ai;

public class CommandIntent {
    
    public enum IntentType {
        ADD_ITEM, REMOVE_ITEM, UPDATE_QUANTITY, SEARCH_PRODUCT, SHOW_LIST, UNKNOWN
    }
    
    private IntentType intent;
    private String productName;
    private String brand;
    private Integer quantity;
    private String unit;
    private Double minPrice;
    private Double maxPrice;

    public CommandIntent() {
    }

    public CommandIntent(IntentType intent, String productName, String brand, Integer quantity, String unit, Double minPrice, Double maxPrice) {
        this.intent = intent;
        this.productName = productName;
        this.brand = brand;
        this.quantity = quantity;
        this.unit = unit;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public IntentType getIntent() {
        return intent;
    }

    public void setIntent(IntentType intent) {
        this.intent = intent;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
