package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/optimize")
public class RouteOptimizationController {
    @PostMapping("/{shipmentId}")
    public void done(){

    }
    @GetMapping("/result/{resultId}")
    public void func(){
        
    }
}
