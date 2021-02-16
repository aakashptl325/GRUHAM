package com.example.demo.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository oderrepo;
	
	public Order getorderbyId(int id)
	{
		Optional<Order> or = oderrepo.findById(id);
		Order o = null;
		try
		{
			o = or.get();
		}
		catch(NoSuchElementException e)
		{
			o = null;
		}
		return o;
	}
	
	public Order addOrder(Order odr)
	{
		return oderrepo.save(odr);
	}
}
