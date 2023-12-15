package com.techelevator.service;

import com.techelevator.model.Product;
import com.techelevator.model.ProductSearchResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductFinderService {

    private RestTemplate restTemplate = new RestTemplate();


    public String getSearchResultString(String searchTerm) {
        String query = String.format("https://world.openfoodfacts.net/cgi/search.pl?search_terms=%s&search_simple=1&action=process&json=1&fields=product_name,nutriments,serving_size",
                searchTerm);
        String result = restTemplate.getForObject(query, String.class);
        return result;
    }

    public ProductSearchResponse getSearchResults(String searchTerm, int pageNum) {
        String query = String.format("https://world.openfoodfacts.net/cgi/search.pl?search_terms=%s&search_simple=1&action=process&json=1&countries_tags_en=united-states&fields=product_name,nutriments,serving_size"
                    + "&sort_by=popularity_key&states_tags=product_name_completed,nutrition-facts-completed&page=%d",
                searchTerm, pageNum);
        ProductSearchResponse result = restTemplate.getForObject(query, ProductSearchResponse.class);
        if (result != null && result.getProducts() != null) {
            for (Product product : result.getProducts()) {
                if (product.getNutriments() != null) {
                    product.getNutriments().setCalories(product.getNutriments().getEnergyKcal());
                }
            }
        }
        return result;
    }
}
