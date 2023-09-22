package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.EmployeeService;
import com.util.response.Response;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeService service;
	
	@PostMapping("/save")
	public Response<?> save(@RequestBody Employee employee) {
		return service.save(employee);
	}
}
