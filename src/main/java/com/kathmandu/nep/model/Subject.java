package com.kathmandu.nep.model;

public class Subject {
	private Integer subjectId;
	private String name;
	private Integer fullMark;
	private Integer passMark;
	private String bookName;
	private String author;
	private String description;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(Integer subjectId, String name, Integer fullMark, Integer passMark, String bookName, String author,
			String description) {
		super();
		this.subjectId = subjectId;
		this.name = name;
		this.fullMark = fullMark;
		this.passMark = passMark;
		this.bookName = bookName;
		this.author = author;
		this.description = description;
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
	public Integer getFullMark() {
		return fullMark;
	}
	public void setFullMark(Integer fullMark) {
		this.fullMark = fullMark;
	}
	public Integer getPassMark() {
		return passMark;
	}
	public void setPassMark(Integer passMark) {
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
				+ passMark + ", bookName=" + bookName + ", author=" + author + ", description=" + description + "]";
	}
	
}
