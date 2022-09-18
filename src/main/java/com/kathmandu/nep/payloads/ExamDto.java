package com.kathmandu.nep.payloads;

import com.kathmandu.nep.entity.Classroom;

public class ExamDto {
	private Integer examId;
	private String name;
	private String date;
	private String time;
	private String type;
	private Classroom classroom;
	private Boolean isCompleted;

	// Getter and setters and constructor
	public ExamDto() {
		super();
	}

	public ExamDto(Integer examId, String name, String date, String time, String type, Classroom classroom,
			Boolean isCompleted) {
		super();
		this.examId = examId;
		this.name = name;
		this.date = date;
		this.time = time;
		this.type = type;
		this.classroom = classroom;
		this.isCompleted = isCompleted;
	}

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "ExamDto{" +
				"examId=" + examId +
				", name='" + name + '\'' +
				", date='" + date + '\'' +
				", time='" + time + '\'' +
				", type='" + type + '\'' +
				", classroom=" + classroom +
				", isCompleted=" + isCompleted +
				'}';
	}
}
