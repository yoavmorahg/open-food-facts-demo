package com.techelevator.api.calorieninjas.service;

import com.techelevator.api.calorieninjas.model.ItemQueryResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class CalorieNinjaApiService {

    @Value("${ninja.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public ItemQueryResponse getInfo(String searchString) {

        String url = String.format("https://api.calorieninjas.com/v1/nutrition?query=%s", searchString);

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Api-Key", apiKey);

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ItemQueryResponse result = null;

        try {
            ResponseEntity<ItemQueryResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ItemQueryResponse.class);
            result = response.getBody();
        } catch (RestClientException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;

    }
}
