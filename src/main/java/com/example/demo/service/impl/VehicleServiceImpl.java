package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
@Service
public class VehicleServiceImpl implements VehicleService {

	@Override
	public Vehicle addVehicle(Long userId, Vehicle vehicle) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'addVehicle'");
	}

	@Override
	public List<Vehicle> getVehiclesByUser(Long userId) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getVehiclesByUser'");
	}

	@Override
	public Vehicle findById(Long id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}
    
}
