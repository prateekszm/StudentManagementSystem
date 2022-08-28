package com.kathmandu.nep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "timetable")
public class TimeTable {
	@Id
	@GeneratedValue
	@Column(name = "timetable_id")
	private Integer timeTableId;

	@Column(name = "day")
	private String day;

	@Column(name = "time")
	private Integer time;

	@OneToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;

	@OneToOne
	@JoinColumn(name = "classroom_id")
	private Classroom classroom;

	// Getters and setter

	public TimeTable() {
		super();
	}

	public TimeTable(Integer timeTableId, String day, Integer time, Subject subject, Classroom classroom) {
		super();
		this.timeTableId = timeTableId;
		this.day = day;
		this.time = time;
		this.subject = subject;
		this.classroom = classroom;
	}

	public Integer getTimeTableId() {
		return timeTableId;
	}

	public void setTimeTableId(Integer timeTableId) {
		this.timeTableId = timeTableId;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "TimeTable [timeTableId=" + timeTableId + ", day=" + day + ", time=" + time + ", subject=" + subject
				+ ", classroom=" + classroom + "]";
	}

}
