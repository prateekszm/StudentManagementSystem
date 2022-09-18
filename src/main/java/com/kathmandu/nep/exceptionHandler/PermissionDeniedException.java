package com.kathmandu.nep.exceptionHandler;

public class PermissionDeniedException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	

	
	private String role;
	private String resourceName;
	public PermissionDeniedException(String role, String resourceName) {
		super(String.format("%s is not allowed on %s ",role,resourceName));
		this.role = role;
		this.resourceName = resourceName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}


}
