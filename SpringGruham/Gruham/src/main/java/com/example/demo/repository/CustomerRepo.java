package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	@Query ("from Customer where user_id=?1 and password=?2")
	Customer FindByUserIdAndPassword(String user_id, String password);

}