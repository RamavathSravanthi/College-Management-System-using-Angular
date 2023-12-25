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

import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.StudentLoginDTO;
import com.example.demo.entity.Student;
import com.example.demo.responses.StudentLoginResponse;
import com.example.demo.service.StudentService;

@RestController //it used to enable the mapping
@CrossOrigin("*") // content with frontend tecnologies
@RequestMapping("api/student") //it is used for fetching path
public class StudentController {
	@Autowired
	public StudentService studentService;
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// bulid Student rest API
		@PostMapping
		public String saveStudent(@RequestBody StudentDTO studentDto) {
			String id=studentService.addStudent(studentDto);
			return id;	
		}

		@GetMapping
		public List<Student> getStudents() {
			return studentService.getAllStudents();
		}

		@GetMapping("{id}")
		public ResponseEntity<Student> getStudentById(@PathVariable("id") long id) {
			return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
		}
		
		@GetMapping("/email/{email}")
		public ResponseEntity<Student> getStudentByEmail(@PathVariable("email") String email) {
			return new ResponseEntity<Student>(studentService.getStudentByEmail(email), HttpStatus.OK);
		}

		@PutMapping("{id}")
		public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student) {
			return new ResponseEntity<Student>(studentService.updateStudent(student, id), HttpStatus.OK);
		}

		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteStudent(@PathVariable("id") long id) {
			studentService.deleteStudent(id);
			return new ResponseEntity<String>("Student deleted Sucessfully...", HttpStatus.OK);
		}
		
		@PostMapping(path="/login")
		public ResponseEntity<?> loginStudent(@RequestBody StudentLoginDTO studentloginDTO) {
			StudentLoginResponse loginResponse = studentService.loginStudent(studentloginDTO);
			return ResponseEntity.ok(loginResponse);
		}

}
