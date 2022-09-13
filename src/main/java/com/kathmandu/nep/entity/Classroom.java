package com.kathmandu.nep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classroom")
public class Classroom {
	@Id
	@Column(name = "classroom_id")
	@GeneratedValue
	public Integer classId;

	@Column(name = "grade")
	public String grade;

	// Getter and setters and constructor

	@Override
	public String toString() {
		return "Classroom{" + "classId=" + classId + ", grade='" + grade + '\'' + '}';
	}

	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classroom(Integer classId, String grade) {
		super();
		this.classId = classId;
		this.grade = grade;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
