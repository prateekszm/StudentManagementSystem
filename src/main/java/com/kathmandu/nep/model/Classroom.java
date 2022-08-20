package com.kathmandu.nep.model;

public class Classroom {
	public Integer classId;
	public Section section;
	public String teacher;
	public String grade;
	
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classroom(Integer classId, Section section, String teacher, String grade) {
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
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
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
