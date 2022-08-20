package com.kathmandu.nep.model;

import java.util.Date;

public class Exam {
	private Integer examId;
	private String name;
	private Date date;
	private String time;
	private String type;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(Integer examId, String name, Date date, String time, String type) {
		super();
		this.examId = examId;
		this.name = name;
		this.date = date;
		this.time = time;
		this.type = type;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
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
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", name=" + name + ", date=" + date + ", time=" + time + ", type=" + type
				+ "]";
	}
	
}
