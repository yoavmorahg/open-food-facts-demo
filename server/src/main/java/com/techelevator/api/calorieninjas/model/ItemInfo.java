package com.techelevator.api.calorieninjas.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemInfo {

    // all values other than calories will be in grams

    private String name;

    private Double calories;

    @JsonProperty("serving_size_g")
    private Double servingSize;
    @JsonProperty("fat_total_g")
    private Double totalFat;

    @JsonProperty("protein_g")
    private Double protein;

    @JsonProperty("carbohydrates_total_g")
    private Double totalCarbs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getServingSize() {
        return servingSize;
    }

    public void setServingSize(Double servingSize) {
        this.servingSize = servingSize;
    }

    public Double getTotalFat() {
        return totalFat;
    }

    public void setTotalFatI(Double totalFatI) {
        this.totalFat = totalFatI;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(Double totalCarbs) {
        this.totalCarbs = totalCarbs;
    }
}
