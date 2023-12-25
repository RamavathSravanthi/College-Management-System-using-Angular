package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;

@EnableJpaRepositories
@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
	Optional<Admin>findOneByEmailAndPassword(String email, String password);
	Admin findByEmail(String email);
	

}
