package com.kathmandu.nep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kathmandu.nep.payloads.BranchDto;
import com.kathmandu.nep.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/")
	public ResponseEntity<BranchDto> createBranch(@RequestBody BranchDto branchDto){
		System.out.println(branchDto.toString());
		BranchDto addedBranchDto = this.adminService.addBranch(branchDto);
		return new ResponseEntity<>(addedBranchDto,HttpStatus.CREATED);
		
	}

	
	

}
