package com.techelevator.controller;

import com.techelevator.api.calorieninjas.model.ItemQueryResponse;
import com.techelevator.api.calorieninjas.service.CalorieNinjaApiService;
import com.techelevator.model.ProductSearchResponse;
import com.techelevator.service.ProductFinderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProductInfoController {

    private ProductFinderService productFinderService;

    private CalorieNinjaApiService calorieNinjaApiService;

    public ProductInfoController(ProductFinderService productFinderService, CalorieNinjaApiService calorieNinjaApiService) {
        this.productFinderService = productFinderService;
        this.calorieNinjaApiService = calorieNinjaApiService;
    }

//    @GetMapping("/search")
//    public String searchString(@RequestParam String searchTerm) {
//        return productFinderService.getSearchResultString(searchTerm);
//    }

//    @GetMapping("/search")
    public ProductSearchResponse searchV2(@RequestParam String searchTerm, @RequestParam(defaultValue="1") int pageNum) {
        return productFinderService.getSearchResults(searchTerm, pageNum);
    }

    @GetMapping("/search")
    public ItemQueryResponse searchV3(@RequestParam String searchTerm) {
        return calorieNinjaApiService.getInfo(searchTerm);
    }
}
