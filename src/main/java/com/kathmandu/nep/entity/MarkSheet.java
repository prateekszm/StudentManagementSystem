package com.kathmandu.nep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "marksheet")
public class MarkSheet {
	@Id
	@GeneratedValue
	@Column(name = "marksheet_id")
	private Integer markSheetId;

	@OneToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;

	@OneToOne
	@JoinColumn(name = "classroom_id")
	private Classroom classroom;

	@OneToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;

	@Column(name = "mark")
	private Double mark;

	@Column(name = "percentage")
	private Double percentage;

	@Column(name = "sgpa")
	private String sgpa;

	@Column(name = "cgpa")
	private String cgpa;

	@OneToOne
	@GeneratedValue
	private Exam exam;

	// Getter and setters and constructor

	public MarkSheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarkSheet(Integer markSheetId, Teacher teacher, Classroom classroom, Subject subjectId, Double mark,
			Double percentage, String sgpa, String cgpa, Exam exam) {
		super();
		this.markSheetId = markSheetId;
		this.teacher = teacher;
		this.classroom = classroom;
		this.subject = subjectId;
		this.mark = mark;
		this.percentage = percentage;
		this.sgpa = sgpa;
		this.cgpa = cgpa;
		this.exam = exam;
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
		return subject;
	}

	public void setSubjectId(Subject subjectId) {
		this.subject = subjectId;
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

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "MarkSheet [markSheetId=" + markSheetId + ", teacher=" + teacher + ", classroom=" + classroom
				+ ", subjectId=" + subject + ", mark=" + mark + ", percentage=" + percentage + ", sgpa=" + sgpa
				+ ", cgpa=" + cgpa + ", exam=" + exam + "]";
	}

}
