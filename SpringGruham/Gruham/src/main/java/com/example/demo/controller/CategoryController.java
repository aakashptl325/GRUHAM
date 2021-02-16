package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.service.CategoryService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryserv;
	
	@GetMapping("/getCategoryById")
	public Category getServiceById(@RequestParam("id") int id)
	{
		return categoryserv.getCategory(id);
	}
	
	@PostMapping(value = "addCategory")
	public Category addService(@RequestBody Category cat)
	{
		return categoryserv.addCategory(cat);
	}
	
	@GetMapping(value = "allCategory")
	public List<Category> allService()
	{
		return categoryserv.allCategory();
	}
}