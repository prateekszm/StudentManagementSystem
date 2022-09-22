package com.kathmandu.nep.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {
	
	@Id
	@GeneratedValue
	@Column(name="attendance_id")
	private Integer attendanceId;
	
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
	}
	public Integer getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Attendance(Student student, Classroom classroom, Date date, Boolean isPresent, Teacher teacher, Integer attendanceId) {
		super();
		this.student = student;
		this.classroom = classroom;
		this.date = date;
		this.isPresent = isPresent;
		this.teacher = teacher;
		this.attendanceId = attendanceId;
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
		return "Attendance [attendanceId " + attendanceId + " student=" + student + ", classroom=" + classroom + ", date=" + date + ", isPresent="
				+ isPresent + ", teacher=" + teacher + "]";
	}
}
