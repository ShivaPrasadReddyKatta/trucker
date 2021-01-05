package com.shiva.truckerapi.service;

import java.util.List;


import com.shiva.truckerapi.entity.Vehicle;

public interface VehicleService {
	
	List<Vehicle> findAll();
	Vehicle getOne(String vin);
	List<Vehicle> update(List<Vehicle> vehiclesList);

}
