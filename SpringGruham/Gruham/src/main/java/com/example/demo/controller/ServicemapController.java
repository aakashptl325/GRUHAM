package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Servicemap;
import com.example.demo.service.ServicemapService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ServicemapController {

	@Autowired
	ServicemapService serv;
	
	@GetMapping("/getServiceById")
	public Servicemap getServiceById(@RequestParam("id") int id)
	{
		return serv.getService(id);
	}
	
	@PostMapping(value = "addService")
	public Servicemap addServiceinfo(@RequestBody Servicemap servmap)
	{
		return serv.addServicemap(servmap);
	}
	
	@PutMapping(value = "updateService")
	public Servicemap updateServiceinfo(@RequestBody Servicemap servmap)
	{
		return serv.updateServicemap(servmap);
	}
	
}