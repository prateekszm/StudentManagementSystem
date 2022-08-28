package com.kathmandu.nep.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam {
	@Id
	@GeneratedValue
	@Column(name="exam_id")
	private Integer examId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "time")
	private String time;
	
	@Column(name = "type")
	private String type;
	
	@OneToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;
	
	
	//Getter and setters and constructor

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(Integer examId, String name, Date date, String time, String type,Subject subject) {
		super();
		this.examId = examId;
		this.name = name;
		this.date = date;
		this.time = time;
		this.type = type;
		this.subject = subject;
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
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", name=" + name + ", date=" + date + ", time=" + time + ", type=" + type
				+ ", subject=" + subject + "]";
	}
	
	
	
}
