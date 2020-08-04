package com.example.demo.service.transport;

import com.example.demo.service.transport.*;
import com.example.demo.util.CO2Utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TransportCommandHandler {

   private static final Map<String, TransportCommand> TRANSPORT_COMMAND_MAP;


   static {
      final Map<String, TransportCommand> transportCommandMap = new HashMap<>();
      transportCommandMap.put("SMALL", new TransportCommand() {
         @Override
         public Map<String, Integer> transportMode() {
            return new SmallCar().transportMode();
         }
      });

      transportCommandMap.put("MEDIUM", new TransportCommand() {
         @Override
         public Map<String, Integer> transportMode() {
            return new MediumCar().transportMode();
         }
      });

      transportCommandMap.put("LARGE", new TransportCommand() {
         @Override
         public Map<String, Integer> transportMode() {
            return new LargeCar().transportMode();
         }
      });

      transportCommandMap.put("BUS", new TransportCommand() {
         @Override
         public Map<String, Integer> transportMode() {
            return new Bus().transportMode();
         }
      });

      transportCommandMap.put("TRAIN", new TransportCommand() {
         @Override
         public Map<String, Integer> transportMode() {
            return new Train().transportMode();
         }
      });

      TRANSPORT_COMMAND_MAP = Collections.unmodifiableMap(transportCommandMap);
   }

   public Integer transportModeCO2Emmision(String transportMode) {

      TransportCommand command = TRANSPORT_COMMAND_MAP.get(CO2Utils.getTransportModeData(transportMode));

      if (command == null) {
         throw new IllegalArgumentException("Invalid transport mode type: "
            + transportMode);
      }
      return command.transportMode().get(transportMode);
   }

}