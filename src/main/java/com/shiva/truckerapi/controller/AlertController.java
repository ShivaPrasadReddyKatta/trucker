package com.shiva.truckerapi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.truckerapi.entity.Alert;
import com.shiva.truckerapi.service.AlertService;

@RestController
@RequestMapping("/alerts")
public class AlertController {
	
	@Autowired
	AlertService service;
	
	@GetMapping
	public List<Alert> findAll(){
		return service.findAllAlerts();
	}
	
	@GetMapping("/priority/{type}")
	public List<Alert> findAlertsByPriority(@PathVariable String type){
		return service.findAlertsByPriority(type);
	}
	
	@GetMapping("/{vin}")
	public List<Alert> findAlertByVin(@PathVariable String vin){
		return service.findAlertsByVin(vin);
	}

}
