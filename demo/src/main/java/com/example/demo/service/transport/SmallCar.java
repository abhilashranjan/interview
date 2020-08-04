package com.example.demo.service.transport;

import java.util.HashMap;
import java.util.Map;

public class SmallCar implements TransportCommand {
    static Map<String, Integer> smallCarEmmision= new HashMap<>();
    static{
        fillEmissionData();
    }
    @Override
    public Map<String, Integer> transportMode() {
        return smallCarEmmision;
    }
    private static void fillEmissionData(){
        smallCarEmmision.put("small-diesel-car",142);
        smallCarEmmision.put("small-petrol-car",154);
        smallCarEmmision.put("small-plugin-hybrid-car",73);
        smallCarEmmision.put("small-electric-car",50);
    }
}
