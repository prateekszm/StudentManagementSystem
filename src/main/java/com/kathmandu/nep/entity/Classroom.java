package com.kathmandu.nep.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "classroom")
public class Classroom {
	@Id
	@Column(name = "classroom_id")
	@GeneratedValue
	private Integer classroomId;

	@Column(name = "grade")
	private String grade;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Section> section;

	// Getter and setters and constructor

	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classroom(Integer classId, String grade, List<Section> section) {
		super();
		this.classroomId = classId;
		this.grade = grade;
		this.section = section;
	}

	public Integer getClassId() {
		return classroomId;
	}

	public void setClassId(Integer classId) {
		this.classroomId = classId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public List<Section> getSection() {
		return section;
	}

	public void setSection(List<Section> section) {
		this.section = section;
	}
	
	@Override
	public String toString() {
		return "Classroom [classroomId=" + classroomId + ", grade=" + grade + ", section=" + section + "]";
	}

}
