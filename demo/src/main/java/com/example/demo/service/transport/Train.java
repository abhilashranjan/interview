package com.example.demo.service.transport;

import java.util.HashMap;
import java.util.Map;

public class Train implements TransportCommand {
    static Map<String, Integer> trainEmmision = new HashMap<>();
    static{
        fillEmissionData();
    }
    @Override
    public Map<String, Integer> transportMode() {
        return trainEmmision;
    }
    private static void fillEmissionData(){
        trainEmmision.put("train",6);
    }
}
