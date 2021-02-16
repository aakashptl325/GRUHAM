package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ServiceProvider;
import com.example.demo.repository.ServiceProviderRepository;

@Service
public class ServiceProviderService {

	@Autowired
	ServiceProviderRepository sprepo;
	
	public ServiceProvider getProvider(int id) 
	{
		Optional<ServiceProvider> sm = sprepo.findById(id);
		ServiceProvider s = null;
		try
		{
			s = sm.get();
		}
		catch(NoSuchElementException e)
		{
			s = null;
		}
		return s;
	}
	
	public List<ServiceProvider> getallprovider()
	{
		List<ServiceProvider> c = sprepo.findAll(); 
		return c;
	}
	
	public ServiceProvider addinfo(ServiceProvider ag)
	{
		return sprepo.save(ag);
	}
	
	
	public ServiceProvider GetUserByUserIdAndPassword(String user_id,String password)
	{
		ServiceProvider user=sprepo.FindByUserIdAndPassword(user_id,password);
		
		if(user !=null)
			return user;
		else
			return user;
	}
	
	public ServiceProvider updateinfo(ServiceProvider ag)
	{
		ServiceProvider a = sprepo.findById(ag.getSpid()).get();
		a.setFirst_name(ag.getFirst_name());
		a.setLast_name(ag.getLast_name());
		a.setEmail(ag.getEmail());
		a.setContact(ag.getContact());
		a.setAddress_line1(ag.getAddress_line1());
		a.setAddress_line2(ag.getAddress_line2());
		a.setCity(ag.getCity());
		a.setPincode(ag.getPincode());
		return sprepo.save(a);
	}
}