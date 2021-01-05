package com.shiva.truckerapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.truckerapi.entity.Alert;
import com.shiva.truckerapi.entity.Readings;
import com.shiva.truckerapi.entity.Vehicle;
import com.shiva.truckerapi.repository.AlertRepository;
import com.shiva.truckerapi.repository.ReadingsRepository;
import com.shiva.truckerapi.repository.VehicleRepository;

@Service
public class ReadingsServiceImpl implements ReadingsService{
	
//	private final ReadingsRepository repository;
//	
//	@Autowired
//	public ReadingsServiceImpl(ReadingsRepository repository) {
//		this.repository = repository;
//	}
	
	@Autowired
	ReadingsRepository repository;
	
	@Autowired
	VehicleRepository vehicleRepo;
	
	@Autowired
	private KieSession session;
	
	@Autowired
	AlertRepository alertRepo;
	
	
	@Override
	public List<Readings> findAll() {
		return repository.findAll();
	}
	
	@Override
	public void onAlert(Alert alert) {
		System.out.println("Inside on alert");
		alertRepo.save(alert);
	}

	@Override
	public Readings postReadings(Readings readings) {
		synchronized(this) {
			List<Alert> alertList = new ArrayList<>();
			Optional<Vehicle> vehicle = vehicleRepo.findByVin(readings.getVin());
			session.setGlobal("vehicle", vehicle.get());
			session.setGlobal("alertList", alertList);
			session.insert(readings);
			session.fireAllRules();
			for(Alert alert : alertList) {
				alertRepo.save(alert);
			}
			
		}
		return repository.save(readings);
	}
	
	

}
