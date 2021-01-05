package com.shiva.truckerapi.service;

import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.truckerapi.entity.Product;
import com.shiva.truckerapi.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> getProducts(){
		return (List<Product>) repository.findAll();
	}
	
	public Product getProductById(int pid) {
		return repository.findById(pid).orElse(null);
	}
	
	public List<Product> saveAll(List<Product> productList) {
		return (List<Product>) repository.saveAll(productList);
	}

}
