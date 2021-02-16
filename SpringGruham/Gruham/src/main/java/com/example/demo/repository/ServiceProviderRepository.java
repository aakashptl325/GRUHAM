package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ServiceProvider;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Integer> {

	@Query("from ServiceProvider where user_id=?1 and password=?2")
	ServiceProvider FindByUserIdAndPassword(String user_id, String password);
}