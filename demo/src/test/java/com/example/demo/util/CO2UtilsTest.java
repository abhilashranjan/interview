package com.example.demo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CO2UtilsTest {

    @Test
    void getTransportModeData() {
        String trnsportMode="small-diesel-car";
        assertEquals("SMALL", CO2Utils.getTransportModeData(trnsportMode));
    }

    @Test
    void printTwoDecimal(){
        assertEquals("1.5", CO2Utils.printTwoDecimal(1.4966799));
    }

    @Test
    void gramVal(){
        String gram="142g";
        assertEquals(142,CO2Utils.gramVal(gram));
    }
}