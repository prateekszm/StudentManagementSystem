package com.kathmandu.nep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
	@Id
	@GeneratedValue
	@Column(name = "subject_id")
	private Integer subjectId;

	@Column(name = "subject_name")
	private String name; 

	@Column(name = "full_mark")
	private Double fullMark;

	@Column(name = "pass_mark")
	private Double passMark;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "author_name")
	private String author;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "classroom_id", nullable = false)
	private Classroom classroom;

	public Subject() {
		super();
		
	}

	public Subject(Integer subjectId, String name, Double fullMark, Double passMark, String bookName, String author,
			String description, Classroom classroom) {
		super();
		this.subjectId = subjectId;
		this.name = name;
		this.fullMark = fullMark;
		this.passMark = passMark;
		this.bookName = bookName;
		this.author = author;
		this.description = description;
		this.classroom = classroom;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

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

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", name=" + name + ", fullMark=" + fullMark + ", passMark="
				+ passMark + ", bookName=" + bookName + ", author=" + author + ", description=" + description
				+ ", classroom=" + classroom + "]";
	}

}
