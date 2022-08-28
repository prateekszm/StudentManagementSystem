package com.kathmandu.nep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kathmandu.nep.entity.Branch;
import com.kathmandu.nep.repository.BranchRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	BranchRepository branchRepository;

	@Override
	public Branch addBranch(Branch branch) {
		Branch tobranch = null;
		try {
			tobranch = branchRepository.save(branch);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return tobranch;
	}

	@Override
	public Branch getBranchById(Branch branch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Branch> getAllBranch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Branch updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Branch deleteBranch(Branch branch) {
		// TODO Auto-generated method stub
		return null;
	}

}
