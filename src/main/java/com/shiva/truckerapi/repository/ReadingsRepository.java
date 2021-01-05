package com.shiva.truckerapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.truckerapi.entity.Readings;

public interface ReadingsRepository extends JpaRepository<Readings, Integer>{
//
//	List<Readings> findAll();
//
//	List<Readings> saveAll(List<Readings> readingsList);

}
