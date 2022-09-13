package com.kathmandu.nep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "section")
public class Section {
	@Id
	@GeneratedValue
	@Column(name = "section_id")
	private Integer sectionId;

	@Column(name = "section_name")
	private String sectionName;

	@OneToOne
	@JoinColumn(name = "branch_id")
	private Branch branch;

	@ManyToOne
	@JoinColumn(name = "classroom_id")
	private Classroom classroom;

	// Getter and setters and constructor
	public Section() {
		super();
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

}
