package ru.example.bookstore.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DiscountService {

    public Integer getDiscount(String nameGroup) {
        ResponseEntity<Integer> responseEntity = new RestTemplate().getForEntity
                ("http://localhost:8081/discount/" + nameGroup, Integer.class);
        if (responseEntity.getStatusCode().isError()) {
            System.out.println(String.valueOf(responseEntity.getStatusCodeValue()));
            throw new IllegalArgumentException(String.valueOf(responseEntity.getStatusCodeValue()));
        }
        return responseEntity.getBody();
    }
}
