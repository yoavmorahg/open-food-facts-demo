package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product {

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("serving_size")
    private String servingSize;


    private NutrimentInfo nutriments;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public NutrimentInfo getNutriments() {
        return nutriments;
    }

    public void setNutriments(NutrimentInfo nutriments) {
        this.nutriments = nutriments;
    }


}
