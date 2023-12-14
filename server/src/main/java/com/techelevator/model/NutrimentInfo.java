package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutrimentInfo {

    @JsonProperty("energy-kcal")
    private double energyKcal;

    private double calories;

    private double carbohydrates;

    private double fat;

    private double fiber;

    private double proteins;

    @JsonProperty("sodium_value")
    private double sodium;

    private double sugars;

    public double getEnergyKcal() {
        return energyKcal;
    }

    public void setEnergyKcal(double energyKcal) {
        this.energyKcal = energyKcal;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getSugars() {
        return sugars;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    /*
 "nutriments": {
                "bicarbonate": 0.219,
                "bicarbonate_100g": 0.0219,
                "bicarbonate_label": "Bicarbonate",
                "bicarbonate_serving": 0.219,
                "bicarbonate_unit": "mg",
                "bicarbonate_value": 219,
                "calcium": 0.068,
                "calcium_100g": 0.0068,
                "calcium_label": "Calcium",
                "calcium_serving": 0.068,
                "calcium_unit": "mg",
                "calcium_value": 68,
                "carbohydrates": 0,
                "carbohydrates_100g": 0,
                "carbohydrates_serving": 0,
                "carbohydrates_unit": "g",
                "carbohydrates_value": 0,
                "carbon-footprint-from-known-ingredients_product": 600,
                "chloride": 0.028,
                "chloride_100g": 0.0028,
                "chloride_label": "Chlorure",
                "chloride_serving": 0.028,
                "chloride_unit": "mg",
                "chloride_value": 28,
                "energy": 0,
                "energy-kcal": 0,
                "energy-kcal_100g": 0,
                "energy-kcal_serving": 0,
                "energy-kcal_unit": "kcal",
                "energy-kcal_value": 0,
                "energy-kcal_value_computed": 0,
                "energy-kj": 0,
                "energy-kj_100g": 0,
                "energy-kj_serving": 0,
                "energy-kj_unit": "kJ",
                "energy-kj_value": 0,
                "energy-kj_value_computed": 0,
                "energy_100g": 0,
                "energy_serving": 0,
                "energy_unit": "kJ",
                "energy_value": 0,
                "fat": 0,
                "fat_100g": 0,
                "fat_serving": 0,
                "fat_unit": "g",
                "fat_value": 0,
                "fiber": 0,
                "fiber_100g": 0,
                "fiber_serving": 0,
                "fiber_unit": "g",
                "fiber_value": 0,
                "fr-fluor": 0.0002,
                "fr-fluor_100g": 2e-05,
                "fr-fluor_label": "Fluor",
                "fr-fluor_serving": 0.0002,
                "fr-fluor_unit": "mg",
                "fr-fluor_value": 0.2,
                "fruits-vegetables-legumes-estimate-from-ingredients_100g": 0,
                "fruits-vegetables-legumes-estimate-from-ingredients_serving": 0,
                "fruits-vegetables-nuts-estimate-from-ingredients_100g": 0,
                "fruits-vegetables-nuts-estimate-from-ingredients_serving": 0,
                "magnesium": 0.011,
                "magnesium_100g": 0.0011,
                "magnesium_label": "Magnésium",
                "magnesium_serving": 0.011,
                "magnesium_unit": "mg",
                "magnesium_value": 11,
                "nitrate": 0.001,
                "nitrate_100g": 0.0001,
                "nitrate_label": "Nitrate",
                "nitrate_modifier": "<",
                "nitrate_serving": 0.001,
                "nitrate_unit": "mg",
                "nitrate_value": 1,
                "nova-group": 1,
                "nova-group_100g": 1,
                "nova-group_serving": 1,
                "nutrition-score-fr": 0,
                "nutrition-score-fr_100g": 0,
                "potassium": 0.002,
                "potassium_100g": 0.0002,
                "potassium_label": "Potassium",
                "potassium_serving": 0.002,
                "potassium_unit": "mg",
                "potassium_value": 2,
                "proteins": 0,
                "proteins_100g": 0,
                "proteins_serving": 0,
                "proteins_unit": "g",
                "proteins_value": 0,
                "salt": 0.0525,
                "salt_100g": 0.00525,
                "salt_serving": 0.0525,
                "salt_unit": "mg",
                "salt_value": 52.5,
                "saturated-fat": 0,
                "saturated-fat_100g": 0,
                "saturated-fat_serving": 0,
                "saturated-fat_unit": "g",
                "saturated-fat_value": 0,
                "silica": 0.012,
                "silica_100g": 0.0012,
                "silica_label": "Silice",
                "silica_serving": 0.012,
                "silica_unit": "mg",
                "silica_value": 12,
                "sodium": 0.021,
                "sodium_100g": 0.0021,
                "sodium_serving": 0.021,
                "sodium_unit": "mg",
                "sodium_value": 21,
                "sugars": 0,
                "sugars_100g": 0,
                "sugars_serving": 0,
                "sugars_unit": "g",
                "sugars_value": 0,
                "sulphate": 0.039,
                "sulphate_100g": 0.0039,
                "sulphate_label": "Sulfate",
                "sulphate_serving": 0.039,
                "sulphate_unit": "mg",
                "sulphate_value": 39
            },
     */
}
