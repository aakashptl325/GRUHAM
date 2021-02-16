package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
	
	@Autowired
	CustomerService cservice;
	
	@GetMapping("/getCust")
	public Customer getCust(@RequestParam("id") int cid)
	{
		return cservice.getinfo(cid);
	}
	
	@GetMapping("/getCustList")
	public List<Customer> getCustList()
	{
		return cservice.getallcust();
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCust(@RequestBody Customer cust)
	{
		return cservice.updateinfo(cust);
	}
	
	@PostMapping("/addCustomer")
	public Customer addCust(@RequestBody Customer customer)
	{
		return cservice.addinfo(customer);
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public Customer LoginUser( Customer user,@RequestParam String username, @RequestParam String password) throws Exception
	{
		Customer isValidUser = cservice.GetUserByUserIdAndPassword(username, password);
        return isValidUser;
	}
}