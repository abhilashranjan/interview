package com.example.demo.service.distance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;

@Component
public class DistanceService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${access.code}")
    String accessCode;

    public void findCordinates(String city){
//        RestTemplate restTemplate= new RestTemplate();
        String url="https://api.openrouteservice.org/geocode/search?api_key="+accessCode+"&text=New%20York&layers=locality";
        System.out.println(accessCode);
//        Object result = restTemplate.getForObject(url, LinkedHashMap.class);
//        System.out.println(result);
    }

}
