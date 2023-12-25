package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.FacultyDTO;
import com.example.demo.dto.FacultyLoginDTO;
import com.example.demo.entity.Faculty;
import com.example.demo.responses.FacultyLoginResponse;

public interface FacultyService {

	void deleteFaculty(long id);

	Faculty updateFaculty(Faculty faculty, long id);

	Faculty getFacultyByEmail(String email);

	Faculty getFacultytById(long id);

	List<Faculty> getAllFaculty();

	String addFaculty(FacultyDTO facualtyDto);

	FacultyLoginResponse loginFacualty(FacultyLoginDTO facultyloginDTO);

}
