package com.kathmandu.nep.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kathmandu.nep.payloads.ApiResponse;
import com.kathmandu.nep.payloads.ApiResponsePermissionDenied;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException resourceNotFoundException){
		String message = resourceNotFoundException.getMessage();
		ApiResponse apiResponse = new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PermissionDeniedException.class)
	public ResponseEntity<ApiResponsePermissionDenied> permissionDenied(PermissionDeniedException permissionDeniedException){
		String message = permissionDeniedException.getMessage();
		ApiResponsePermissionDenied permissionDenied = new ApiResponsePermissionDenied(message,"Action");
		return new ResponseEntity<ApiResponsePermissionDenied>(permissionDenied,HttpStatus.FORBIDDEN);
	}
	
}
