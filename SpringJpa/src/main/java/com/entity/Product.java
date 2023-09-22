package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_price")
	private Double productPrice;
	
	@Column(name = "created_at")
	private Date createdAt = new Date();
	
	@Column(name = "updated_at")
	private Date updatedAt = new Date();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Product(Integer id, String productName, Double productPrice, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
