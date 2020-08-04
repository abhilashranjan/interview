package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmissionServiceTest {

    EmissionService emissionService= new EmissionService();
    @Test
    void getEmmision() {
        String trnsportMode="small-diesel-car";
        String emmision = emissionService.getEmmision(10.54, trnsportMode);
        assertEquals("1.5kg",emmision);
    }
}