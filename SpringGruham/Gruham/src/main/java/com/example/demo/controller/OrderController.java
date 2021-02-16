package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.service.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrderController {

	@Autowired
	OrderService odrserv;
	
	@GetMapping("/getOrderById")
	public Order getOrder(@RequestParam("id") int id)
	{
		return odrserv.getorderbyId(id);
	}
	
	@PostMapping(value = "addOrder")
	public Order addOrderinfo(@RequestBody Order odr)
	{
		return odrserv.addOrder(odr);
	}
}