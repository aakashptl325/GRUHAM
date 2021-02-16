package com.example.demo.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_order")
public class Order {

	@Id
	@Column(name="Order_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	
	@Column(name="Date_Time")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="GMT")
	private Date datetime;
	
	@Column(name="Total_Price")
	private double total_price;
	
	@JsonIgnoreProperties("orders")
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "cid")
	Customer custodr;
	
	@JsonIgnoreProperties("orderlist")
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "spid")
	ServiceProvider odrpro;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int order_id, Date datetime, double total_price, Customer custodr, ServiceProvider odrpro) {
		super();
		this.order_id = order_id;
		this.datetime = datetime;
		this.total_price = total_price;
		this.custodr = custodr;
		this.odrpro = odrpro;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public Customer getCustodr() {
		return custodr;
	}

	public void setCustodr(Customer custodr) {
		this.custodr = custodr;
	}

	public ServiceProvider getOdrpro() {
		return odrpro;
	}

	public void setOdrpro(ServiceProvider odrpro) {
		this.odrpro = odrpro;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", datetime=" + datetime + ", total_price=" + total_price + ", custodr="
				+ custodr + ", odrpro=" + odrpro + "]";
	}

	
}
