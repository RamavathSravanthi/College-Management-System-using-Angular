package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AdminDTO;
import com.example.demo.dto.AdminLoginDTO;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Faculty;
import com.example.demo.entity.Student;
import com.example.demo.responses.AdminLoginResponse;
import com.example.demo.service.AdminService;
import com.example.demo.service.FacultyService;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin("*") // content with frontend tecnologies
@RequestMapping("api/admin")
public class AdminController {
	@Autowired
	public AdminService adminService;
	@Autowired
	public StudentService studentService;
	@Autowired
	public FacultyService facultyService;
	
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@PostMapping
	public String saveAdmin(@RequestBody AdminDTO adminDto) {
		String id=adminService.addAdmin(adminDto);
		return id;	
	}
	
	@GetMapping
	public List<Admin> getAdmins() {
		return adminService.getAllAdmin();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable("id") long adminId) {
		return new ResponseEntity<Admin>(adminService.getAdmintById(adminId),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable("id") long id, @RequestBody Admin admin) {
		return new ResponseEntity<Admin>(adminService.updateAdmin(admin, id), HttpStatus.OK);
	}
	
	@PostMapping(path="/login")
	public ResponseEntity<?> loginAdmin(@RequestBody AdminLoginDTO adminloginDTO) {
		AdminLoginResponse loginResponse = adminService.loginAdmin(adminloginDTO);
		return ResponseEntity.ok(loginResponse);
	}
	
	@GetMapping("/student")
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentId) {
		return new ResponseEntity<Student>(studentService.getStudentById(studentId), HttpStatus.OK);
	}

	@DeleteMapping("/student/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") long id) {
		studentService.deleteStudent(id);
		return new ResponseEntity<String>("Student deleted Sucessfully...", HttpStatus.OK);
	}
	
	@GetMapping("/student/{email}")
	public ResponseEntity<Student> getStudentByEmail(@PathVariable("email") String email) {
		return new ResponseEntity<Student>(studentService.getStudentByEmail(email), HttpStatus.OK);
	}
	
	@GetMapping("/faculty")
	public List<Faculty>getFacualty()
	{
		return facultyService.getAllFaculty();
	}	
	@GetMapping("/faculty/{id}")
	public ResponseEntity<Faculty>getFacultyById(@PathVariable("id")long id)
	{
	    return new ResponseEntity<Faculty>(facultyService.getFacultytById(id),HttpStatus.OK);
	}
	@GetMapping("/faculty/{email}")
	public ResponseEntity<Faculty>getFacultyByEmail(@PathVariable("email")String email)
	{
		return new ResponseEntity<Faculty>(facultyService.getFacultyByEmail(email),HttpStatus.OK);
	}
	
	@DeleteMapping("/facualty/{id}")
	public ResponseEntity<String>deleteFacualty(@PathVariable("id")long id)
	{
	   facultyService.deleteFaculty(id);//deleteStudent(id);
	    return new ResponseEntity<String>("Faculty deleted Sucessfully...",HttpStatus.OK);
	}

	
	

}
