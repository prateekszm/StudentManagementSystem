package com.kathmandu.nep.payloads;

import com.kathmandu.nep.entity.Classroom;
import com.kathmandu.nep.entity.Subject;

public class TimeTableDto {
	private Integer timeTableId;
	private String day;
	private String time;
	private Subject subject;
	private Classroom classroom;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
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
		return "TimeTableDto [timeTableId=" + timeTableId + ", day=" + day + ", time=" + time + ", subject=" + subject
				+ ", classroom=" + classroom + "]";
	}
	
}
