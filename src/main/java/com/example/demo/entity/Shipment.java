package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Vehicle vehicle;
    private Location pickupLocation;
    private Location dropLocation;
    private Double weightKg;
    private LocalDate scheduledDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Location getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(Location pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public Location getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(Location dropLocation) {
		this.dropLocation = dropLocation;
	}
	public Double getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(Double weightKg) {
		this.weightKg = weightKg;
	}
	public LocalDate getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(LocalDate scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public Shipment(Long id, Vehicle vehicle, Location pickupLocation, Location dropLocation, Double weightKg,
			LocalDate scheduledDate) {
		this.id = id;
		this.vehicle = vehicle;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.weightKg = weightKg;
		this.scheduledDate = scheduledDate;
	}
	public Shipment() {
	}
    
}
