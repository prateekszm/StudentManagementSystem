package com.kathmandu.nep.payloads;

public class ApiResponsePermissionDenied {
	private String role;
	private String action;
		
	
	
	public ApiResponsePermissionDenied(String role, String action) {
		super();
		this.role = role;
		this.action = action;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
	
}
