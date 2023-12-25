package com.example.demo.dto;

public class FacultyDTO {
	
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String password;
	private String subject;
	private long salary;
	private long phone_No;
	private String gender;
	private String qualificaton;
	
	public FacultyDTO() {
		super();
	}

	public FacultyDTO(long id, String firstName, String lastName, int age, String email, String password,
			String subject, long salary, long phone_No, String gender, String qualificaton) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password = password;
		this.subject = subject;
		this.salary = salary;
		this.phone_No = phone_No;
		this.gender = gender;
		this.qualificaton = qualificaton;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualificaton() {
		return qualificaton;
	}

	public void setQualificaton(String qualificaton) {
		this.qualificaton = qualificaton;
	}

	@Override
	public String toString() {
		return "FacultyDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", email=" + email + ", password=" + password + ", subject=" + subject + ", salary=" + salary
				+ ", phone_No=" + phone_No + ", gender=" + gender + ", qualificaton=" + qualificaton + "]";
	}
	
	

}
