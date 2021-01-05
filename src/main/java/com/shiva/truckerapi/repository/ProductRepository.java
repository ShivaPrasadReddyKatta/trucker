package com.shiva.truckerapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.shiva.truckerapi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
