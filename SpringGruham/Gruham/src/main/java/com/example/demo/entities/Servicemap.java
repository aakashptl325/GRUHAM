package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_service_map")
public class Servicemap {
	
	@Id
	@Column(name = "Map_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int map_id;
	
	@Column(name = "Price")
	private double price;
	
	@JsonIgnoreProperties("serv")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Service_Id")
	Category service;
	
	@JsonIgnoreProperties("servpro")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_Provider")
	ServiceProvider provider;

	public Servicemap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Servicemap(int map_id, double price, Category service, ServiceProvider provider) {
		super();
		this.map_id = map_id;
		this.price = price;
		this.service = service;
		this.provider = provider;
	}

	public int getMap_id() {
		return map_id;
	}

	public void setMap_id(int map_id) {
		this.map_id = map_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getService() {
		return service;
	}

	public void setService(Category service) {
		this.service = service;
	}

	public ServiceProvider getProvider() {
		return provider;
	}

	public void setProvider(ServiceProvider provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		return "Servicemap [map_id=" + map_id + ", price=" + price + ", service=" + service + ", provider=" + provider
				+ "]";
	}

}