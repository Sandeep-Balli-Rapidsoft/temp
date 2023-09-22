package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository repository;
	
	public Product save(Product product) {
		return repository.save(product);
	}
	
	public List<Product> getAll() {
		return repository.findAll();
	}
}
