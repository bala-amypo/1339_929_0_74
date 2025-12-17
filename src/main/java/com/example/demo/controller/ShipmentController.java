package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {
    @PostMapping("/{vehicleId}")
    public void done(){

    }
    @GetMapping("/{shipmentId}")
    public void ans(){

    }
}
