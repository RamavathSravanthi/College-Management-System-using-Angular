package com.example.demo.dto;


public class StudentDTO {
	
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String dob;
	private String gender;
	private String email;
	private String password;
	private long mobile;
	private String course;
	private String motherName;
	private String fatherName;
	private String address;
	
	public StudentDTO() {
		super();
	}

	public StudentDTO(long id, String firstName, String lastName, int age, String dob, String gender, String email,
			String password, long mobile, String course, String motherName, String fatherName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.course = course;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.address = address;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", dob=" + dob + ", gender=" + gender + ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + ", course=" + course + ", motherName=" + motherName + ", fatherName=" + fatherName
				+ ", address=" + address + "]";
	}
	
	
	
	

}
