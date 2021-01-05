package com.shiva.truckerapi.service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.truckerapi.entity.Vehicle;
import com.shiva.truckerapi.exception.VehicleNotFoundException;
import com.shiva.truckerapi.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{
	
//	private final VehicleRepository repository;
//	
//	@Autowired
//	public VehicleServiceImpl(VehicleRepository repository) {
//		this.repository = repository;
//	}
	
	@Autowired
	VehicleRepository repository;
	
	@Override
	public List<Vehicle> findAll() {
		return (List<Vehicle>) repository.findAll();
	}

	@Override
	public Vehicle getOne(String vin) {
		Optional<Vehicle> vehicle = repository.findByVin(vin);
		return vehicle.orElseThrow(() -> new VehicleNotFoundException("Vehicle with VIN:- "+vin+" not found"));
	}
	
	@Override
	public List<Vehicle> update(List<Vehicle> vehiclesList) {
//		vehiclesList.forEach(v -> {
//			if(!repository.findByVin(v.getVin()).isPresent()) {
//				System.out.println(v.getLastServiceDate());
//			}
//		});
		return repository.saveAll(vehiclesList);
		
	}

	
	

}
