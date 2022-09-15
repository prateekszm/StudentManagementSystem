package com.kathmandu.nep.payloads;

public class ClassroomDto {
	private Integer classroomId;
	private String grade;
	
	public ClassroomDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassroomDto(Integer classroomId, String grade) {
		super();
		this.classroomId = classroomId;
		this.grade = grade;
	}
	public Integer getClassroomId() {
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
}
