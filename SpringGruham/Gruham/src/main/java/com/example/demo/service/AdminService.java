package com.example.demo.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository repo;
	
	public Admin getinfo(int id)
	{
		Optional<Admin> a = repo.findById(id);
		Admin ad = null;
		try
		{
			ad = a.get();
		}
		catch(NoSuchElementException e)
		{
			ad = null;
		}
		return ad;
	}
	
	
	public Admin GetUserByUserIdAndPassword(String user_id,String password)
	{
		Admin user=repo.FindByUserIdAndPassword(user_id,password);
		
		if(user !=null)
			return user;
		else
			return user;
	}
}