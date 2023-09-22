package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Product;
import com.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	public ProductService productService;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.save(product), HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAll() {
		return new ResponseEntity<List<Product>>(productService.getAll(), HttpStatus.OK);
	}
	
}
