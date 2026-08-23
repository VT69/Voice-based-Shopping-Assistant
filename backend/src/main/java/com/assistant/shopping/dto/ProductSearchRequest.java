package com.assistant.shopping.dto;

public class ProductSearchRequest {
    
    private String query;
    private Double maxPrice;
    private String brand;
    
    public ProductSearchRequest() {
    }

    public ProductSearchRequest(String query, Double maxPrice, String brand) {
        this.query = query;
        this.maxPrice = maxPrice;
        this.brand = brand;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
