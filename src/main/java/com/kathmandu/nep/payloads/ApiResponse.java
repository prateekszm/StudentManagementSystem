package com.kathmandu.nep.payloads;

public class ApiResponse {

	private String message;
	private boolean success;
	
	public ApiResponse() {
		super();
		
	}
	public ApiResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	@Override
	public String toString() {
		return "ApiResponse [message=" + message + ", success=" + success + ", getMessage()=" + getMessage()
				+ ", isSuccess()=" + isSuccess() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
