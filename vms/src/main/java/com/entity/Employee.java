package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.util.Role;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "password")
	private String password;

	@Column(name = "empcode")
	private String empCode;
	
	@Column(name = "role_type")
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "created_by")
	private Employee createdBy;
	
	@Column(name = "updated_at")
	private Date updatedAt;
	
	@Column(name = "updated_by")
	private Employee updatedBy;
	
	@Column(name= "is_active")
	private Boolean isActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Employee getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Employee updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Employee(Integer id, String name, String phone, String email, Date dob, String password, String empCode,
			Role role, Date createdAt, Employee createdBy, Date updatedAt, Employee updatedBy, Boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
		this.password = password;
		this.empCode = empCode;
		this.role = role;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.isActive = isActive;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
