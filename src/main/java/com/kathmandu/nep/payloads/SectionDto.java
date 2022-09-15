package com.kathmandu.nep.payloads;

import com.kathmandu.nep.entity.Branch;
import com.kathmandu.nep.entity.Classroom;

public class SectionDto {
	private Integer sectionId;
	private String sectionName;
	private Branch branch;
	private Classroom classroom;

	public SectionDto() {
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
