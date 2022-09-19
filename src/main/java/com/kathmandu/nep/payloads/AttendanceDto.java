package com.kathmandu.nep.payloads;

import java.util.Date;

import com.kathmandu.nep.entity.Classroom;
import com.kathmandu.nep.entity.Student;
import com.kathmandu.nep.entity.Teacher;

public class AttendanceDto {
	private Integer attendanceId;
	private Student student;
	private Classroom classroom;
	private Date date;
	private Boolean isPresent;
	private Teacher teacher;
	public Integer getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(Integer attendanceId) {
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
	
}
