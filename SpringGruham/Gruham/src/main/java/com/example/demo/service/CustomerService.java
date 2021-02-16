package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;
	
	public Customer getinfo(int id)
	{
		Optional<Customer> c = repo.findById(id);
		Customer cust = null;
		try
		{
			cust = c.get();
		}
		catch(NoSuchElementException e)
		{
			cust = null;
		}
		return cust;
	}
	
	
	public List<Customer> getallcust()
	{
		List<Customer> c = repo.findAll(); 
		return c;
	}
	
	public Customer addinfo(Customer cust)
	{
		return repo.save(cust);
	}
	
	
	public Customer GetUserByUserIdAndPassword(String user_id,String password)
	{
		Customer user=repo.FindByUserIdAndPassword(user_id,password);
		
		if(user !=null)
			return user;
		else
			return user;
	}
	
	public Customer updateinfo(Customer cust)
	{
		Customer c = repo.findById(cust.getCid()).get();
		c.setFirst_name(cust.getFirst_name());
		c.setLast_name(cust.getLast_name());
		c.setEmail(cust.getEmail());
		c.setContact(cust.getContact());
		c.setAddress_line1(cust.getAddress_line1());
		c.setAddress_line2(cust.getAddress_line2());
		c.setCity(cust.getCity());
		c.setPincode(cust.getPincode());
		return repo.save(c);
	}
}