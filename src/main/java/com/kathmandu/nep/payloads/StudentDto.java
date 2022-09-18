package com.kathmandu.nep.payloads;

import com.kathmandu.nep.entity.Classroom;

public class StudentDto {
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNo;
	private String email;
	private String fatherName;
	private String motherName;
	private String gender;
	private String dob;
	private String localGurdian;
	private String localGurdianNumber;
	private Classroom classroom;
	
	public StudentDto() {
		super();
	}
	public StudentDto(Integer studentId, String firstName, String lastName, String address, String phoneNo,
			String email, String fatherName, String motherName, String gender, String dob, String localGurdian,
			String localGurdianNumber, Classroom classroom) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.dob = dob;
		this.localGurdian = localGurdian;
		this.localGurdianNumber = localGurdianNumber;
		this.classroom = classroom;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLocalGurdian() {
		return localGurdian;
	}
	public void setLocalGurdian(String localGurdian) {
		this.localGurdian = localGurdian;
	}
	public String getLocalGurdianNumber() {
		return localGurdianNumber;
	}
	public void setLocalGurdianNumber(String localGurdianNumber) {
		this.localGurdianNumber = localGurdianNumber;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", gender=" + gender + ", dob=" + dob + ", localGurdian="
				+ localGurdian + ", localGurdianNumber=" + localGurdianNumber + ", classroom=" + classroom + "]";
	}
	
	
}
