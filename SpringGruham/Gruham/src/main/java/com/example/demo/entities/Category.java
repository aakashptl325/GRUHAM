package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_services")
public class Category {
	
	@Id
	@Column(name="Service_Id")
	private int service_id;
	
	@Column(name="service_name")
	private String service_name;
	
	@JsonIgnoreProperties("service")
	@OneToMany(mappedBy = "service")
	Set<Servicemap> serv = new HashSet<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int service_Id, String service_Name, Set<Servicemap> serv) {
		super();
		service_id = service_Id;
		service_name = service_Name;
		this.serv = serv;
	}

	public int getService_Id() {
		return service_id;
	}

	public void setService_Id(int service_Id) {
		service_id = service_Id;
	}

	public String getService_Name() {
		return service_name;
	}

	public void setService_Name(String service_Name) {
		service_name = service_Name;
	}

	public Set<Servicemap> getServ() {
		return serv;
	}

	public void setServ(Set<Servicemap> serv) {
		this.serv = serv;
	}

	@Override
	public String toString() {
		return "Category [Service_Id=" + service_id + ", Service_Name=" + service_name + ", serv=" + serv + "]";
	}

}