package com.example.demo.service;

import com.example.demo.service.transport.TransportCommandHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportCommandHandlerTest {

    TransportCommandHandler transportCommandHandler= new TransportCommandHandler();

    @Test
    void transportModeCO2Emmision() {
        String trnsportMode="small-diesel-car";
        Integer modeCO2Emmision = transportCommandHandler.transportModeCO2Emmision(trnsportMode);
        assertEquals(142, modeCO2Emmision);
    }
}