package com.example.demo.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CustomerType;
import com.example.demo.repository.CustomerTypeRepository;

@Service
public class CustomerTypeService {

	@Autowired
	CustomerTypeRepository CustTypeRepo;
	
	public CustomerType getinfo(String id)
	{
		Optional<CustomerType> c = CustTypeRepo.findById(id);
		CustomerType cust = null;
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
}