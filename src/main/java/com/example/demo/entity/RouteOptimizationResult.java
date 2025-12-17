package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;

@Entity
@Builder
public class RouteOptimizationResult {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Shipment shipment;
    private Double optimizedDistanceKm;
    private Double estimatedFuelUsageL;
    private LocalDateTime generatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	public Double getOptimizedDistanceKm() {
		return optimizedDistanceKm;
	}
	public void setOptimizedDistanceKm(Double optimizedDistanceKm) {
		this.optimizedDistanceKm = optimizedDistanceKm;
	}
	public Double getEstimatedFuelUsageL() {
		return estimatedFuelUsageL;
	}
	public void setEstimatedFuelUsageL(Double estimatedFuelUsageL) {
		this.estimatedFuelUsageL = estimatedFuelUsageL;
	}
	public LocalDateTime getGeneratedAt() {
		return generatedAt;
	}
	public void setGeneratedAt(LocalDateTime generatedAt) {
		this.generatedAt = generatedAt;
	}
	public RouteOptimizationResult(Long id, Shipment shipment, Double optimizedDistanceKm, Double estimatedFuelUsageL,
			LocalDateTime generatedAt) {
		this.id = id;
		this.shipment = shipment;
		this.optimizedDistanceKm = optimizedDistanceKm;
		this.estimatedFuelUsageL = estimatedFuelUsageL;
		this.generatedAt = generatedAt;
	}
	public RouteOptimizationResult() {
	}
    

}
