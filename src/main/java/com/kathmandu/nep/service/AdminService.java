package com.kathmandu.nep.service;

import java.util.List;

import com.kathmandu.nep.entity.Branch;


public interface AdminService {
	
	
	//CRUD Branch
	
	Branch addBranch(Branch branch);
	
	Branch getBranchById(Branch branch);
	
	List<Branch> getAllBranch();
	
	Branch updateBranch(Branch branch);
	
	Branch deleteBranch(Branch branch);
	

}
