package com.example.demo.service.transport;

import java.util.HashMap;
import java.util.Map;

public class MediumCar implements TransportCommand {
    static Map<String, Integer> mediumCarEmmision = new HashMap<>();
    static{
        fillEmissionData();
    }
    @Override
    public Map<String, Integer> transportMode()  {
        return mediumCarEmmision;
    }
    private static void fillEmissionData(){
        mediumCarEmmision.put("medium-diesel-car",171);
        mediumCarEmmision.put("medium-petrol-car",192);
        mediumCarEmmision.put("medium-plugin-hybrid-car",110);
        mediumCarEmmision.put("medium-electric-car",58);
    }
}
