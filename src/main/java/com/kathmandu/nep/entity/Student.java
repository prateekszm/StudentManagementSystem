package com.kathmandu.nep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "student_id")
	private Integer studentId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone_no")
	private String phoneNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "father_name")
	private String fatherName;
	
	@Column(name = "mother_name")
	private String motherName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "local_gurdian")
	private String localGurdian;
	
	@Column(name="local_gurdian_number")
	private String localGurdianNumber;
	
	@OneToOne
	@JoinColumn(name = "classroom_id")
	private Classroom classroom;
	
	//Getter and setters and constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String firstName, String lastName, String address, String phoneNo, String email,
			String fatherName, String motherName, String gender, String dob, String localGurdian, String localGurdianNumber,
			Classroom classroom) {
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
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", phoneNo=" + phoneNo + ", email=" + email + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", gender=" + gender + ", localGurdian=" + localGurdian + ", localGurdianNumber="
				+ localGurdianNumber + "dob= "+ dob +", classroom=" + classroom + "]";
	}
	
}
