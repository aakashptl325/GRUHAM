package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Admin_Id")
	private int adminid;
	
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

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String first_name, String last_name, String email, String password, String contact,
			String address_line1, String address_line2, String city, String pincode, String user_id) {
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
	}

	public Admin(int adminid, String first_name, String last_name, String email, String password, String contact,
			String address_line1, String address_line2, String city, String pincode, String user_id) {
		super();
		this.adminid = adminid;
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
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
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

	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", password=" + password + ", contact=" + contact + ", address_line1=" + address_line1
				+ ", address_line2=" + address_line2 + ", city=" + city + ", pincode=" + pincode + ", user_id="
				+ user_id + "]";
	}

}