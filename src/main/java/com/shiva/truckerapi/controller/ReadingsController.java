package com.shiva.truckerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shiva.truckerapi.entity.Readings;
import com.shiva.truckerapi.service.ReadingsServiceImpl;

@RestController
@RequestMapping("/readings")
//@CrossOrigin(origins = {"http://mocker.egen.io", "http://mocker.egen.academy"})
@CrossOrigin(origins="*")
public class ReadingsController {
	
	@Autowired
	ReadingsServiceImpl service;
	
	@GetMapping
	public List<Readings> findAll(){
		return service.findAll();
	}
	
	@PostMapping
	public Readings addReadings(@RequestBody Readings readingsList ){
		return service.postReadings(readingsList);
	}
}
