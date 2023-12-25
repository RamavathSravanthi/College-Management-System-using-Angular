package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AdminDTO;
import com.example.demo.dto.AdminLoginDTO;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Faculty;
import com.example.demo.entity.Student;
import com.example.demo.exception.CollegeResourceNotFound;
import com.example.demo.repository.AdminRepo;
import com.example.demo.repository.FacultyRepo;
import com.example.demo.repository.StudentRepo;
import com.example.demo.responses.AdminLoginResponse;


@Service
public class AdminServiceIMPL implements AdminService {
	
	@Autowired
	private  AdminRepo adminRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private  StudentRepo studentRepo;
	@Autowired
	private  FacultyRepo facultyRepo;
	
	

	public AdminServiceIMPL(AdminRepo adminRepo) {
		super();
		this.adminRepo = adminRepo;
	}

	@Override
	public String addAdmin(AdminDTO adminDto) {
		Admin admin=new Admin(adminDto.getId(),adminDto.getAdminName(),adminDto.getEmail(),
				this.passwordEncoder.encode(adminDto.getPassword()));
			adminRepo.save(admin);
					return admin.getAdminName();
	}

	@Override
	public List<Admin> getAllAdmin() {
		return adminRepo.findAll();
	}

	@Override
	public Admin getAdmintById(long id) {
		return adminRepo.findById(id).orElseThrow(()->new CollegeResourceNotFound("Admin","Id","id"));
	}

	@Override
	public Admin updateAdmin(Admin admin, long id) {
		Admin existingAdmin=adminRepo.findById(id).orElseThrow(() 
				->new CollegeResourceNotFound("Admin","Id","id"));
		existingAdmin.setAdminName(admin.getAdminName());
		existingAdmin.setEmail(admin.getEmail());
		existingAdmin.setPassword(admin.getPassword());
				//save existing 
		adminRepo.save(existingAdmin);
				return existingAdmin;
	}

	@Override
	public AdminLoginResponse loginAdmin(AdminLoginDTO adminloginDTO) {
		String msg="";
		Admin adm1=adminRepo.findByEmail(adminloginDTO.getEmail());
		if(adm1!=null)
		{
			String password=adminloginDTO.getPassword();
			String encodedPassword=adm1.getPassword();
			//Boolean isPwdRight=password.equals(password);
			Boolean isPwdRight=passwordEncoder.matches(password,encodedPassword);//matches(password);
			if(isPwdRight)
			{
Optional<Admin>admin=adminRepo.findOneByEmailAndPassword(adminloginDTO.getEmail(),encodedPassword);
 if(admin.isPresent())
{
	   return new AdminLoginResponse("Login Successfully",true);
}   
 else
	{
		return new AdminLoginResponse("Login Failed",false);
	}
	}
else
	{
	return new AdminLoginResponse("Password Not Match",false);
		}
		}
else
		{
	return new AdminLoginResponse("Email not exist",false);
	}
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
	public Student getStudentByEmail(String email) {
		return studentRepo.findByEmail(email);
	}

	@Override
	public void deleteStudent(long id) {
		studentRepo.findById(id).orElseThrow(() 
				->new CollegeResourceNotFound("Student","Id","id"));
		studentRepo.deleteById(id);
		
		
	}

	@Override
	public List<Faculty> getAllFaculty() {
		return facultyRepo.findAll();
	}

	@Override
	public Faculty getFacultyById(long id) {
		return facultyRepo.findById(id).orElseThrow(()->new CollegeResourceNotFound("Faculty","Id","id"));
	}

	@Override
	public Faculty grtFacultyByEmail(String email) {
		return facultyRepo.findByEmail(email);
	}

	@Override
	public void deleteFaculty(long id) {
		facultyRepo.findById(id).orElseThrow(()->new CollegeResourceNotFound("Faculty","Id","id"));
		facultyRepo.deleteById(id);
		
	}

}
