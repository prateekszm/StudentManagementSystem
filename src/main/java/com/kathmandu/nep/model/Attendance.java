package com.kathmandu.nep.model;

import java.util.Date;

public class Attendance {
	private Student student;
	private Classroom classroom;
	private Date date;
	private Boolean isPresent;
	private Teacher teacher;
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendance(Student student, Classroom classroom, Date date, Boolean isPresent, Teacher teacher) {
		super();
		this.student = student;
		this.classroom = classroom;
		this.date = date;
		this.isPresent = isPresent;
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getIsPresent() {
		return isPresent;
	}
	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Attendance [student=" + student + ", classroom=" + classroom + ", date=" + date + ", isPresent="
				+ isPresent + ", teacher=" + teacher + "]";
	}
}
