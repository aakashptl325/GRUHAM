package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryrepo;
	
	public Category getCategory(int id) 
	{
		Optional<Category> cat = categoryrepo.findById(id);
		Category c = null;
		try
		{
			c = cat.get();
		}
		catch(NoSuchElementException e)
		{
			c = null;
		}
		return c;
	}
	
	public Category addCategory(Category cat)
	{
		return categoryrepo.save(cat);
	}
	
	public List<Category> allCategory()
	{
		return categoryrepo.findAll();
	}
}
