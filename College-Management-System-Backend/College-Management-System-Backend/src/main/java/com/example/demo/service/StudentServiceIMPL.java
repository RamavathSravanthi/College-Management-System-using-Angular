package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.StudentLoginDTO;
import com.example.demo.entity.Student;
import com.example.demo.exception.CollegeResourceNotFound;
import com.example.demo.repository.StudentRepo;
import com.example.demo.responses.StudentLoginResponse;


@Service
public class StudentServiceIMPL implements StudentService {
	@Autowired
	private  StudentRepo studentRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
		//private PasswordEncoder passwordEncoder;
	public StudentServiceIMPL(StudentRepo studentRepo) {
	this.studentRepo = studentRepo;
		}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepo.findById(id).orElseThrow(()->new CollegeResourceNotFound("Student","Id","id"));
	}

	@Override
	public void deleteStudent(long id) {
		studentRepo.findById(id).orElseThrow(()->new CollegeResourceNotFound("Student","Id","id"));
		studentRepo.deleteById(id);
		
	}

	@Override
	public String addStudent(StudentDTO studentDto) {
		Student student=new Student(studentDto.getId(),studentDto.getFirstName(),studentDto.getLastName(),studentDto.getAge(),
				studentDto.getDob(),studentDto.getGender(),studentDto.getEmail(),
				this.passwordEncoder.encode((studentDto.getPassword())),studentDto.getMobile(),studentDto.getCourse(),studentDto.getMotherName(),studentDto.getFatherName(),
				studentDto.getAddress());
		studentRepo.save(student);
		return student.getFirstName();
	}

	@Override
	public Student getStudentByEmail(String email) {
		return studentRepo.findByEmail(email);
	}

	@Override
	public Student updateStudent(Student student, long id) {
		Student existingStudent=studentRepo.findById(id).orElseThrow(() 
				->new CollegeResourceNotFound("Student","Id","id"));
				 existingStudent.setFirstName(student.getFirstName());
				 existingStudent.setLastName(student.getLastName());
				 existingStudent.setAge(student.getAge());
				 existingStudent.setDob(student.getDob());
				 existingStudent.setGender(student.getGender());
				 existingStudent.setEmail(student.getEmail());
				 existingStudent.setPassword(student.getPassword());
				 existingStudent.setMobile(student.getMobile());
				 existingStudent.setCourse(student.getCourse());
				 existingStudent.setMotherName(student.getMotherName());
				 existingStudent.setFatherName(student.getFatherName());
				 existingStudent.setAddress(student.getAddress());
				//save existing 
				studentRepo.save(existingStudent);
				return existingStudent;
	}

	@Override
	public StudentLoginResponse loginStudent(StudentLoginDTO studentloginDTO) {
		String msg="";
		Student stud1=studentRepo.findByEmail(studentloginDTO.getEmail());
		if(stud1!=null)
		{
			String password=studentloginDTO.getPassword();//getPassword();
			String encodedPassword=stud1.getPassword();
			//Boolean isPwdRight=password.equals(password);
			Boolean isPwdRight=passwordEncoder.matches(password,encodedPassword);//matches(password);
			if(isPwdRight)
			{
Optional<Student>student=studentRepo.findOneByEmailAndPassword(studentloginDTO.getEmail(),encodedPassword);
 if(student.isPresent())
{
	   return new StudentLoginResponse("Login Successfully",true);
}   
 else
	{
		return new StudentLoginResponse("Login Failed",false);
	}
	}
else
	{
	return new StudentLoginResponse("Password Not Match",false);
		}
		}
else
		{
	return new StudentLoginResponse("Email not exist",false);
	}
	}


}
