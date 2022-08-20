package com.kathmandu.nep.model;

public class MarkSheet {
	private Integer markSheetId;
	private Teacher teacher;
	private Classroom classroom;
	private Subject subjectId;
	private Double mark;
	private Double percentage;
	private String sgpa;
	private String cgpa;
	
	public MarkSheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarkSheet(Integer markSheetId, Teacher teacher, Classroom classroom, Subject subjectId, Double mark,
			Double percentage, String sgpa, String cgpa) {
		super();
		this.markSheetId = markSheetId;
		this.teacher = teacher;
		this.classroom = classroom;
		this.subjectId = subjectId;
		this.mark = mark;
		this.percentage = percentage;
		this.sgpa = sgpa;
		this.cgpa = cgpa;
	}
	public Integer getMarkSheetId() {
		return markSheetId;
	}
	public void setMarkSheetId(Integer markSheetId) {
		this.markSheetId = markSheetId;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public Subject getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public String getSgpa() {
		return sgpa;
	}
	public void setSgpa(String sgpa) {
		this.sgpa = sgpa;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "MarkSheet [markSheetId=" + markSheetId + ", teacher=" + teacher + ", classroom=" + classroom
				+ ", subjectId=" + subjectId + ", mark=" + mark + ", percentage=" + percentage + ", sgpa=" + sgpa
				+ ", cgpa=" + cgpa + "]";
	}
	
}
