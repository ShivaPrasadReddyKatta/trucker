package com.shiva.truckerapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shiva.truckerapi.entity.Alert;

public interface AlertService {
	
	List<Alert> findAllAlerts();
	
	List<Alert> findAlertsByPriority(String type);
	List<Alert> findAlertsByVin(String vin);

}
