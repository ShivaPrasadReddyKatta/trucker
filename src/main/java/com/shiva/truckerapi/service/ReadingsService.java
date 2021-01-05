package com.shiva.truckerapi.service;

import java.util.List;

import com.shiva.truckerapi.entity.Alert;
import com.shiva.truckerapi.entity.Readings;

public interface ReadingsService {
	List<Readings> findAll();
	Readings postReadings(Readings readings);
	void onAlert(Alert alert);

}
