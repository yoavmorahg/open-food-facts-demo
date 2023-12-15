package com.techelevator.controller;

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

    public ProductInfoController(ProductFinderService productFinderService) {
        this.productFinderService = productFinderService;
    }

//    @GetMapping("/search")
//    public String searchString(@RequestParam String searchTerm) {
//        return productFinderService.getSearchResultString(searchTerm);
//    }

    @GetMapping("/search")
    public ProductSearchResponse searchV2(@RequestParam String searchTerm) {
        return productFinderService.getSearchResults(searchTerm);
    }
}
