package com.example.demo.service.transport;

import java.util.HashMap;
import java.util.Map;

public class Bus implements TransportCommand {
    static Map<String, Integer> busEmmision = new HashMap<>();
    static{
        fillEmissionData();
    }

    @Override
    public Map<String, Integer> transportMode() {
        return busEmmision;
    }


    private static void fillEmissionData(){
        busEmmision.put("bus",73);
    }
}
