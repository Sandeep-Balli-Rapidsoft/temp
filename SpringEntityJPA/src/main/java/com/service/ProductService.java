package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	public ProductDao productDao;
	
	public Product save(Product product) {
		return productDao.save(product);
	}
	
	public List<Product> getAll() {
		return productDao.getAll();
	}
}
