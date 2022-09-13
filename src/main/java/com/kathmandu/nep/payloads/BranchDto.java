package com.kathmandu.nep.payloads;

public class BranchDto {
    private Integer branchId;
    private String name;
    
	public BranchDto(Integer branchId, String name) {
		super();
		this.branchId = branchId;
		this.name = name;
	}
	
	public BranchDto() {
		super();
		
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
		return "BranchDto [branchId=" + branchId + ", name=" + name + "]";
	}
	
}
