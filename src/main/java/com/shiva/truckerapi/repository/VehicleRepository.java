package com.shiva.truckerapi.repository;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.shiva.truckerapi.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, String>{
	Optional<Vehicle> findByVin(String vin);

}
