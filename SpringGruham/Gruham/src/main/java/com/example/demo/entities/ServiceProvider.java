package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_service_provider")
public class ServiceProvider {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="spid")
	private int spid;
	
	@Column(name="First_Name")
	private String first_name;
	
	@Column(name="Last_Name")
	private String last_name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Contact")
	private String contact;
	
	@Column(name="Address_Line1")
	private String address_line1;
	
	@Column(name="Address_Line2")
	private String address_line2;
	
	@Column(name="City")
	private String city;
	
	@Column(name="pin_code")
	private String pincode;
	
	@Column(name="User_Id")
	private String user_id;

	
	@JsonIgnoreProperties("provider")
	@OneToMany(mappedBy = "provider")
	Set<Servicemap> servpro = new HashSet<>();

	@JsonIgnoreProperties("cust")
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "Customer_Type")
	CustomerType custtype;
	
	@JsonIgnoreProperties(value = {"odrpro"}, allowSetters = true)
	@OneToMany(mappedBy = "odrpro")
	Set<Order> odrlist = new HashSet<>();
	
	public ServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ServiceProvider(String first_name, String last_name, String email, String password, String contact,
			String address_line1, String address_line2, String city, String pincode, String user_id,
			CustomerType custtype) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.pincode = pincode;
		this.user_id = user_id;
		this.custtype = custtype;
	}


	public ServiceProvider(int spid, String first_name, String last_name, String email, String password, String contact,
			String address_line1, String address_line2, String city, String pincode, String user_id,
			Set<Servicemap> servpro, CustomerType custtype, Set<Order> odrlist) {
		super();
		this.spid = spid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.pincode = pincode;
		this.user_id = user_id;
		this.servpro = servpro;
		this.custtype = custtype;
		this.odrlist = odrlist;
	}

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Set<Servicemap> getServpro() {
		return servpro;
	}

	public void setServpro(Set<Servicemap> servpro) {
		this.servpro = servpro;
	}

	public CustomerType getCusttype() {
		return custtype;
	}

	public void setCusttype(CustomerType custtype) {
		this.custtype = custtype;
	}

	public Set<Order> getOdrlist() {
		return odrlist;
	}

	public void setOdrlist(Set<Order> odrlist) {
		this.odrlist = odrlist;
	}

	@Override
	public String toString() {
		return "ServiceProvider [spid=" + spid + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", password=" + password + ", contact=" + contact + ", address_line1=" + address_line1
				+ ", address_line2=" + address_line2 + ", city=" + city + ", pincode=" + pincode + ", user_id=" + user_id + ", servpro=" + servpro + ", custtype=" + custtype + ", odrlist=" + odrlist
				+ "]";
	}
}