package com.example.demo.service.transport;

import java.util.HashMap;
import java.util.Map;

public class LargeCar implements TransportCommand {
    static Map<String, Integer> largeCarEmmision = new HashMap<>();
    static{
        fillEmissionData();
    }
    @Override
    public Map<String, Integer> transportMode()  {
        return largeCarEmmision;
    }
    private static void fillEmissionData(){
        largeCarEmmision.put("large-diesel-car",209);
        largeCarEmmision.put("large-petrol-car",282);
        largeCarEmmision.put("large-plugin-hybrid-car",126);
        largeCarEmmision.put("medium-electric-car",73);
    }
}
