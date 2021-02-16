package com.example.demo.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Servicemap;
import com.example.demo.repository.ServicemapRepository;

@Service
public class ServicemapService {

	@Autowired
	ServicemapRepository smrepo;

	public Servicemap getService(int id) 
	{
		Optional<Servicemap> sm = smrepo.findById(id);
		Servicemap s = null;
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
	
	public Servicemap addServicemap(Servicemap serve)
	{
		return smrepo.save(serve);
	}
	
	public Servicemap updateServicemap(Servicemap serve)
	{
		return smrepo.save(serve);
	}
}