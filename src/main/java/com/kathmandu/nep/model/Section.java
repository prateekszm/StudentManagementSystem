package com.kathmandu.nep.model;

public class Section {
	private Integer sectionId;
	private String sectionName;
	private Branch branch;
	public Section() {
		super();
	}
	public Section(Integer sectionId, String sectionName, Branch branch) {
		super();
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.branch = branch;
	}
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Section [sectionId=" + sectionId + ", sectionName=" + sectionName + ", branch=" + branch + "]";
	}

}
