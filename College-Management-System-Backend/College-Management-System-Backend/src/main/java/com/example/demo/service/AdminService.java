package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.AdminDTO;
import com.example.demo.dto.AdminLoginDTO;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Faculty;
import com.example.demo.entity.Student;
import com.example.demo.responses.AdminLoginResponse;

public interface AdminService {

	String addAdmin(AdminDTO adminDto);

	List<Admin> getAllAdmin();

	Admin getAdmintById(long id);

	Admin updateAdmin(Admin admin, long id);

	AdminLoginResponse loginAdmin(AdminLoginDTO adminloginDTO);
	
	List<Student>getAllStudents();
	
	Student getStudentById(long id);
	
	Student getStudentByEmail(String email);
	
	void deleteStudent(long id);
	
	List<Faculty>getAllFaculty();
	
	Faculty getFacultyById(long id);
	
	Faculty grtFacultyByEmail(String email);
	
	void deleteFaculty(long id);
	

}

