package com.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.util.response.Response;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeDao dao;
	
	public Response<?> save(Employee employee) {
		employee.setCreatedAt(new Date());
		employee.setUpdatedAt(new Date());
		employee.setIsActive(true);
		Response<?> response = new Response<>("success", this.dao.save(employee), HttpStatus.OK.value());
		return response;
	}
}
