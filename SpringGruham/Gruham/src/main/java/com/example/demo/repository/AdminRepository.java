package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	@Query ("from Admin where user_id=?1 and password=?2")
	Admin FindByUserIdAndPassword(String user_id, String password);
}
