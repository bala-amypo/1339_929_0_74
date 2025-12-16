package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Shipment;
import com.example.demo.entity.Vehicle;

public interface ShipmentRepository extends JpaRepository<Shipment,Long>{
    Vehicle findByVehicleId(Long vehicleId);
}
