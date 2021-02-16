package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.CustomerType;
import com.example.demo.service.CustomerTypeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerTypeController {

	@Autowired
	CustomerTypeService custTypeServe;
	
	@GetMapping("/getCustType")
	public CustomerType getCustType(@RequestParam("id") String id)
	{
		return custTypeServe.getinfo(id);
	}
}
