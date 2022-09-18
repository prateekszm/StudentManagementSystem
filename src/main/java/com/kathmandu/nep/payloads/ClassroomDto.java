package com.kathmandu.nep.payloads;

import java.util.List;

import com.kathmandu.nep.entity.Section;

public class ClassroomDto {
	private Integer classroomId;
	private String grade;
	private List<Section> section;
	
	public ClassroomDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassroomDto(Integer classroomId, String grade, List<Section> section) {
		super();
		this.classroomId = classroomId;
		this.grade = grade;
		this.section = section;
	}

	public Integer getClassId() {
		return classroomId;
	}

	public void setClassroomId(Integer classroomId) {
		this.classroomId = classroomId;
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
		return "ClassroomDto [classroomDtoId=" + classroomId + ", grade=" + grade + ", section=" + section + "]";
	}

}
