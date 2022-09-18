package com.kathmandu.nep.payloads;

import com.kathmandu.nep.entity.Classroom;

public class SubjectDto {
	private Integer subjectId;
	private String name; 
	private Double fullMark;
	private Double passMark;
	private String bookName;
	private String author;
	private String description;
	private Classroom classroom;
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getFullMark() {
		return fullMark;
	}
	public void setFullMark(Double fullMark) {
		this.fullMark = fullMark;
	}
	public Double getPassMark() {
		return passMark;
	}
	public void setPassMark(Double passMark) {
		this.passMark = passMark;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return "SubjectDto [subjectDtoId=" + subjectId + ", name=" + name + ", fullMark=" + fullMark + ", passMark="
				+ passMark + ", bookName=" + bookName + ", author=" + author + ", description=" + description
				+ ", classroom=" + classroom + "]";
	}
	
}
