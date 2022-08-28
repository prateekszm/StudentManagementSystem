package com.kathmandu.nep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "classroom")
public class Classroom {
	@Id
	@Column(name="class_id")
	@GeneratedValue
	public Integer classId;
	
	@OneToOne
	@JoinColumn(name="section_id")
	public Section section;
	
	@OneToOne
	@JoinColumn(name = "teacher_id")
	public Teacher teacher;
	
	@Column(name = "grade")
	public String grade;
	
	//Getter and setters and constructor
	
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Classroom(Integer classId, Section section, Teacher teacher, String grade) {
		super();
		this.classId = classId;
		this.section = section;
		this.teacher = teacher;
		this.grade = grade;
	}
	
	
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Classroom [classId=" + classId + ", section=" + section + ", teacher=" + teacher + ", grade=" + grade
				+ "]";
	}
	
	
}
