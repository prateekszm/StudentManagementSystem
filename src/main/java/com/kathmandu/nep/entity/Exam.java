package com.kathmandu.nep.entity;

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
	@Column(name = "exam_id")
	private Integer examId;

	@Column(name = "name")
	private String name;

	@Column(name = "date")
	private String date;

	@Column(name = "time")
	private String time;

	@Column(name = "type")
	private String type;

	@OneToOne
	@JoinColumn(name = "classroom_id")
	private Classroom classroom;

	// Getter and setters and constructor

	public Exam() {
		super();
	}

	public Exam(Integer examId, String name, String date, String time, String type, Classroom classroom) {
		this.examId = examId;
		this.name = name;
		this.date = date;
		this.time = time;
		this.type = type;
		this.classroom = classroom;
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

	@Override
	public String toString() {
		return "Exam{" + "examId=" + examId + ", name='" + name + '\'' + ", date=" + date + ", time='" + time + '\''
				+ ", type='" + type + '\'' + ", classroom=" + classroom + '}';
	}
}
