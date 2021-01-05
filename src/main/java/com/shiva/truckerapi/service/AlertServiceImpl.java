package com.shiva.truckerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.truckerapi.entity.Alert;
import com.shiva.truckerapi.repository.AlertRepository;

@Service
public class AlertServiceImpl implements AlertService{
	
	@Autowired
	AlertRepository repository;
	
	@Override
	public List<Alert> findAllAlerts() {
		return repository.findAll();
	}
	
	@Override
	public List<Alert> findAlertsByPriority(String type){
		return repository.findByPriority(type);
	}

	@Override
	public List<Alert> findAlertsByVin(String vin) {
		return repository.findByVin(vin);
	}
	
	

}
