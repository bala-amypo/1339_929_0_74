package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;
import com.example.demo.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Long>{
    User findByUserId(Long userId);
}
