package com.kathmandu.nep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch {
	@Id
	@GeneratedValue
	@Column(name = "branch_id")
	private Integer branchId;
	
	@Column(name = "name")
	private String name;
	
	//Getter and setters and constructor
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
