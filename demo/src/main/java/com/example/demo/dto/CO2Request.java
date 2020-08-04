package com.example.demo.dto;

public class CO2Request {
    String start;
    String end;
    String transportMethod;

    public CO2Request() {
    }

    public CO2Request(String start, String end, String transportMethod) {
        this.start = start;
        this.end = end;
        this.transportMethod = transportMethod;
    }
}
