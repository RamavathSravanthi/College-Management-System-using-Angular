package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FacultyDTO;
import com.example.demo.dto.FacultyLoginDTO;
import com.example.demo.entity.Faculty;
import com.example.demo.exception.CollegeResourceNotFound;
import com.example.demo.repository.FacultyRepo;
import com.example.demo.responses.FacultyLoginResponse;


@Service
public class FacultyServiceIMPL implements FacultyService {
	
	@Autowired
	private  FacultyRepo facultyRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
		public FacultyServiceIMPL(FacultyRepo facultyRepo) {
			this.facultyRepo = facultyRepo;
		}

	@Override
	public void deleteFaculty(long id) {
		facultyRepo.findById(id).orElseThrow(()->new CollegeResourceNotFound("Faculty","Id","id"));
		facultyRepo.deleteById(id);
		
	}

	@Override
	public Faculty updateFaculty(Faculty faculty, long id) {
		Faculty existingFaculty=facultyRepo.findById(id).orElseThrow(() ->new CollegeResourceNotFound("Faculty","Id","id"));
		 existingFaculty.setFirstName(faculty.getFirstName());
		 existingFaculty.setLastName(faculty.getLastName());
		 existingFaculty.setAge(faculty.getAge());
		 existingFaculty.setEmail(faculty.getEmail());
		 existingFaculty.setPassword(faculty.getPassword());
		 existingFaculty.setSubject(faculty.getSubject());
		 existingFaculty.setSalary(faculty.getSalary());
		 existingFaculty.setPhone_No(faculty.getPhone_No());
		 existingFaculty.setGender(faculty.getGender());
		 existingFaculty.setQualificaton(faculty.getQualificaton());
		
		 
		//save existing 
		facultyRepo.save(existingFaculty);
		return existingFaculty;
	}

	@Override
	public Faculty getFacultyByEmail(String email) {
		return facultyRepo.findByEmail(email);
	}

	@Override
	public Faculty getFacultytById(long id) {
		return facultyRepo.findById(id).orElseThrow(()-> new CollegeResourceNotFound("Faculty","Id","id"));
	}

	@Override
	public List<Faculty> getAllFaculty() {
		return facultyRepo.findAll();
	}

	@Override
	public String addFaculty(FacultyDTO facultyDto) {
		
		Faculty faculty=new Faculty(facultyDto.getId(),facultyDto.getFirstName(),facultyDto.getLastName(),
				facultyDto.getAge(),facultyDto.getEmail(),this.passwordEncoder.encode((facultyDto.getPassword())),
				facultyDto.getSubject(),facultyDto.getSalary(),facultyDto.getPhone_No(),facultyDto.getGender(),
				facultyDto.getQualificaton());
		facultyRepo.save(faculty);
				

					return faculty.getFirstName();
	}

	@Override
	public FacultyLoginResponse loginFacualty(FacultyLoginDTO facultyloginDTO) {
		String msg="";
		Faculty facu1=facultyRepo.findByEmail(facultyloginDTO.getEmail());//findByEmail();
		if(facu1!=null)
		{
			String password=facultyloginDTO.getPassword();//getPassword();
			String encodedPassword=facu1.getPassword();
			Boolean isPwdRight=passwordEncoder.matches(password,encodedPassword);//matches(password);
			if(isPwdRight)
			{
Optional<Faculty>facualty=facultyRepo.findOneByEmailAndPassword(facultyloginDTO.getEmail(),encodedPassword);
 if(facualty.isPresent())
{
	   return new FacultyLoginResponse("Login Successfully",true);
}   
 else
	{
		return new FacultyLoginResponse("Login Failed",false);
	}
	}
else
	{
	return new FacultyLoginResponse("Password Not Match",false);
		}
		}
else
		{
	return new FacultyLoginResponse("Email not exist",false);
	}
	}
	

}
