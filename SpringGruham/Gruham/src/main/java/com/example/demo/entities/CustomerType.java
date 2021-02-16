package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_customer_type")
public class CustomerType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String Customer_Type;
	
	@Column
	private String Type_Name;

	@JsonIgnoreProperties("custtype")
	@OneToMany(mappedBy = "custtype")
	Set<ServiceProvider> cust = new HashSet<>();
	
	@JsonIgnoreProperties("custType")
	@OneToMany(mappedBy = "custType")
	Set<Customer> customer = new HashSet<>();
	
	public CustomerType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerType(String customer_Type, String type_Name, Set<ServiceProvider> cust, Set<Customer> customer) {
		super();
		Customer_Type = customer_Type;
		Type_Name = type_Name;
		this.cust = cust;
		this.customer = customer;
	}

	public String getCustomer_Type() {
		return Customer_Type;
	}

	public void setCustomer_Type(String customer_Type) {
		Customer_Type = customer_Type;
	}

	public String getType_Name() {
		return Type_Name;
	}

	public void setType_Name(String type_Name) {
		Type_Name = type_Name;
	}

	public Set<ServiceProvider> getCust() {
		return cust;
	}

	public void setCust(Set<ServiceProvider> cust) {
		this.cust = cust;
	}

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerType [Customer_Type=" + Customer_Type + ", Type_Name=" + Type_Name + ", cust=" + cust
				+ ", customer=" + customer + "]";
	}

	

}