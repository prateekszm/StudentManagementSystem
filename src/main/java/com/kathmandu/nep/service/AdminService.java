package com.kathmandu.nep.service;

import java.util.List;

import com.kathmandu.nep.entity.Branch;
import com.kathmandu.nep.entity.Section;
import com.kathmandu.nep.entity.Subject;
import com.kathmandu.nep.payloads.BranchDto;


public interface AdminService {
	
	
	//CRUD Branch
	
	BranchDto addBranch(BranchDto branchDto);
	
	BranchDto getBranchById(Integer branchId);
	
	List<BranchDto> getAllBranch();
	
	BranchDto updateBranch(BranchDto branchDto);
	
	void deleteBranch(Integer branchId);
	
	
	
	
	
	
	
	

	

}
