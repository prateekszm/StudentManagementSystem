package com.kathmandu.nep.payloads;

import com.kathmandu.nep.entity.Classroom;
import com.kathmandu.nep.entity.Subject;

public class TeacherDto {
	private Integer teacherId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNo;
	private String email;
	private String fatherName;
	private String motherName;
	private String gender;
	private Subject subject;
	private Classroom classroom;
	public TeacherDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeacherDto(Integer teacherId, String firstName, String lastName, String address, String phoneNo,
			String email, String fatherName, String motherName, String gender, Subject subject, Classroom classroom) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.subject = subject;
		this.classroom = classroom;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
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
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return "TeacherDto [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", gender=" + gender + ", subject=" + subject + ", classroom="
				+ classroom + "]";
	}
	
}
