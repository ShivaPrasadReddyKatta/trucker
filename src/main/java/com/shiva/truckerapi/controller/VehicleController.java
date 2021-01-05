package com.shiva.truckerapi.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.truckerapi.entity.Vehicle;
import com.shiva.truckerapi.service.VehicleService;

@RestController
@RequestMapping("/vehicles")
@CrossOrigin(origins = {"http://mocker.egen.io", "http://mocker.egen.academy"})
public class VehicleController {
	
	@Autowired
	VehicleService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Vehicle> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/{vin}")
	public Vehicle getOne(@PathVariable("vin") String vin) {
		return service.getOne(vin);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public void update(@RequestBody List<Vehicle> vehiclesList) {
		System.out.println("Loading vehicle details from the list of size " + vehiclesList.size());
		service.update(vehiclesList);
	}
	

}
