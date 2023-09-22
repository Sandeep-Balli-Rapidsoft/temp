package com.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.dao.EmployeeDao;
import com.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Employee save(Employee employee) {
		Session session = this.entityManager.unwrap(Session.class);
		Employee emp = (Employee) session.save(session);
		return emp;
	}

}
