package com.kathmandu.nep.model;

public class Branch {
	private Integer branchId;
	private String name;
	public Branch() {
		super();
		
	}
	public Branch(Integer branchId, String name) {
		super();
		this.branchId = branchId;
		this.name = name;
	}
	
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", name=" + name + "]";
	}
}
