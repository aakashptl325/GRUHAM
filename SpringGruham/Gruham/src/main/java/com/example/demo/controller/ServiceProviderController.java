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
import com.example.demo.entities.ServiceProvider;
import com.example.demo.service.ServiceProviderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ServiceProviderController {

	@Autowired
	ServiceProviderService providerservice;
	
	@GetMapping("/getServiceProviderById")
	public ServiceProvider getServiceById(@RequestParam("id") int id)
	{
		return providerservice.getProvider(id);
	}
	
	@GetMapping("/getServiceProviderList")
	public List<ServiceProvider> getProviderList()
	{
		return providerservice.getallprovider();
	}
	
	@PutMapping("/updateServiceProvider")
	public ServiceProvider updateCust(@RequestBody ServiceProvider aw)
	{
		return providerservice.updateinfo(aw);
	}
	
	@PostMapping("/addServiceProvider")
	public ServiceProvider addCust(@RequestBody ServiceProvider cust)
	{
		return providerservice.addinfo(cust);
	}
	
	@RequestMapping(value="/loginServiceProvider",method=RequestMethod.GET)
	public ServiceProvider LoginUser( ServiceProvider user,@RequestParam String username, @RequestParam String password) throws Exception
	{
		ServiceProvider isValidUser = providerservice.GetUserByUserIdAndPassword(username, password);
        return isValidUser;
	}
}