package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Faculty;

@EnableJpaRepositories
@Repository
public interface FacultyRepo extends JpaRepository<Faculty,Long>{
	Optional<Faculty>findOneByEmailAndPassword(String email,String password);
	Faculty findByEmail(String email);
	

}
