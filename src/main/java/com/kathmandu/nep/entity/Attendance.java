package com.kathmandu.nep.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendence")
public class Attendance {
	
	@Id
	@GeneratedValue
	@Column(name="attendence_id")
	private Integer attendenceId;
	
	@OneToOne
    @JoinColumn(name="student_id")
	private Student student;
	
	@OneToOne
    @JoinColumn(name="classroom_id")
	private Classroom classroom;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "is_present")
	private Boolean isPresent;
	
	@OneToOne
    @JoinColumn(name="teacher_id")
	private Teacher teacher;
	
	//Getter and setters and constructor
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getAttendenceId() {
		return attendenceId;
	}
	public void setAttendenceId(Integer attendenceId) {
		this.attendenceId = attendenceId;
	}
	public Attendance(Student student, Classroom classroom, Date date, Boolean isPresent, Teacher teacher, Integer attendenceId) {
		super();
		this.student = student;
		this.classroom = classroom;
		this.date = date;
		this.isPresent = isPresent;
		this.teacher = teacher;
		this.attendenceId = attendenceId;
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
		return "Attendance [attendenceid " + attendenceId + " student=" + student + ", classroom=" + classroom + ", date=" + date + ", isPresent="
				+ isPresent + ", teacher=" + teacher + "]";
	}
}
