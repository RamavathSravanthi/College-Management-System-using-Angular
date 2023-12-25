package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.StudentLoginDTO;
import com.example.demo.entity.Student;
import com.example.demo.responses.StudentLoginResponse;

public interface StudentService {

	List<Student> getAllStudents();

	Student getStudentById(long id);

	void deleteStudent(long id);

	String addStudent(StudentDTO studentDto);

	Student getStudentByEmail(String email);

	Student updateStudent(Student student, long id);

	StudentLoginResponse loginStudent(StudentLoginDTO studentloginDTO);

}
