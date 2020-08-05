package com.example.demo.service.distance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DistanceServiceTest {
    @Autowired
    DistanceService distanceService;
    @Test
    void findCordinates(){
        distanceService.findCordinates("New York");
    }

}