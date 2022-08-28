package com.kathmandu.nep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kathmandu.nep.entity.Branch;
import com.kathmandu.nep.service.AdminServiceImpl;



@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminServiceImpl adminService;
	
	@PostMapping(path="/add/branch")
	@ResponseBody
	public Branch addBranch(@ModelAttribute Branch branch) {
		
		Branch tobranch = adminService.addBranch(branch);
		
		return tobranch;
	}
	
}
