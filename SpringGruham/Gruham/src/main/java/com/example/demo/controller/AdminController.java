package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Customer;
import com.example.demo.service.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	AdminService aservice;
	
	@GetMapping("/getAdmin")
	public Admin getCust(@RequestParam("id") int cid)
	{
		return aservice.getinfo(cid);
	}
	
	
	@RequestMapping(value="/loginAdmin",method=RequestMethod.GET)
	public Admin LoginUser( Customer user,@RequestParam String username, @RequestParam String password) throws Exception
	{
		Admin isValidUser = aservice.GetUserByUserIdAndPassword(username, password);
        return isValidUser;
	}
}