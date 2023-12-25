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

import com.example.demo.dto.FacultyDTO;
import com.example.demo.dto.FacultyLoginDTO;
import com.example.demo.entity.Faculty;
import com.example.demo.responses.FacultyLoginResponse;
import com.example.demo.service.FacultyService;

@RestController//to enable restful controlled
@CrossOrigin("*")//content with frontend tecnologies
@RequestMapping("api/faculty")
public class FacultyController {

	@Autowired
	public FacultyService facultyService;
	 public FacultyController(FacultyService facultyService) {
		super();
		this.facultyService = facultyService;
	}
	 
	 
		//bulid Faculaty rest API
@PostMapping
	public String saveFaculty(@RequestBody FacultyDTO facualtyDto) {
		String id=facultyService.addFaculty(facualtyDto);
		return id;	
	}
		@GetMapping
		public List<Faculty>getFacualty()
		{
			return facultyService.getAllFaculty();
		}	
		@GetMapping("{id}")
		public ResponseEntity<Faculty>getFacualtyById(@PathVariable("id")long id)
		{
			return new ResponseEntity<Faculty>(facultyService.getFacultytById(id),HttpStatus.OK);
		}
		
		@GetMapping("/email/{email}")
		public ResponseEntity<Faculty>getFacultyByEmail(@PathVariable("email")String email)
		{
			return new ResponseEntity<Faculty>(facultyService.getFacultyByEmail(email),HttpStatus.OK);
		}
		
		@PutMapping("{id}")
		public ResponseEntity<Faculty>updateFaculty(@PathVariable("id")long id,@RequestBody Faculty faculty)
		{
			return new ResponseEntity<Faculty>(facultyService.updateFaculty(faculty, id),HttpStatus.OK);
		}
		@DeleteMapping("{id}")
		public ResponseEntity<String>deleteFaculty(@PathVariable("id")long id)
		{
			facultyService.deleteFaculty(id);//deleteStudent(id);
			return new ResponseEntity<String>("Faculty deleted Sucessfully...",HttpStatus.OK);
		}
		@PostMapping(path="/login")
			public ResponseEntity<?>loginFaculty(@RequestBody FacultyLoginDTO facultyloginDTO)
			{
			FacultyLoginResponse loginResponse=facultyService.loginFacualty(facultyloginDTO);
			return ResponseEntity.ok(loginResponse);
			}
		 
}
