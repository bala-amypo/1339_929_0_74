package com.example.demo.service;

import com.example.demo.entity.RouteOptimizationResult;

public interface RouteOptimizationResultService {
    RouteOptimizationResult optimizeRoute(Long shipmentId);
    RouteOptimizationResult getResult(Long resultId);
}
