package com.example.demo.service;

import com.example.demo.service.transport.TransportCommandHandler;
import com.example.demo.util.CO2Utils;

public class EmissionService {

   TransportCommandHandler transportCommandHandler= new TransportCommandHandler();

   public String getEmmision(Double distance, String transportMode ){
        Integer tranportEmmission=transportCommandHandler.transportModeCO2Emmision(transportMode);
        Double emission=(distance*tranportEmmission)/1000;
        return CO2Utils.printTwoDecimal(emission)+"kg";
   }

}
