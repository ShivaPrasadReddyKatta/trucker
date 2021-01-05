package com.shiva.truckerapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.truckerapi.entity.Alert;

public interface AlertRepository extends JpaRepository<Alert, Integer>{
	List<Alert> findByPriority(String type);
	List<Alert> findByVin(String vin);
}
