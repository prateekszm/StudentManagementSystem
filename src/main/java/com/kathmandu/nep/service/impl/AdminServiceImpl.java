package com.kathmandu.nep.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kathmandu.nep.entity.Branch;
import com.kathmandu.nep.exceptionHandler.ResourceNotFoundException;
import com.kathmandu.nep.payloads.BranchDto;
import com.kathmandu.nep.repository.BranchRepository;
import com.kathmandu.nep.repository.SectionRepository;
import com.kathmandu.nep.repository.SubjectRepository;
import com.kathmandu.nep.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BranchRepository branchRepository;
	@Autowired
	private SectionRepository sectionRepository;
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public BranchDto addBranch(BranchDto branchDto) {
		Branch branch = this.modelMapper.map(branchDto,Branch.class);
		Branch addedBranch = this.branchRepository.save(branch);
		return this.modelMapper.map(addedBranch, BranchDto.class);
	}
	@Override
	public BranchDto getBranchById(Integer branchId) {
		Branch branch = this.branchRepository.findById(branchId)
				.orElseThrow(()-> new ResourceNotFoundException("Branch", "branch id", branchId.toString()));
		
		return this.modelMapper.map(branch, BranchDto.class);
	}
	@Override
	public List<BranchDto> getAllBranch() {
		List<Branch> branchList = this.branchRepository.findAll();
		List<BranchDto> branchDtoList = branchList.stream().map((branchDto) -> 
										this.modelMapper.map(branchDto, BranchDto.class)).collect(Collectors.toList());
		return branchDtoList;
	}
	@Override
	public BranchDto updateBranch(BranchDto branchDto) {
		Branch branch = this.modelMapper.map(branchDto, Branch.class);
		Branch updatedBranch = this.branchRepository.save(branch);
		return this.modelMapper.map(updatedBranch, BranchDto.class);
	}
	@Override
	public void deleteBranch(Integer branchId) {
		Branch branch = this.branchRepository.findById(branchId).
				orElseThrow(()->new ResourceNotFoundException("Branch","Branch id",branchId.toString()));
		this.branchRepository.delete(branch);
	
	}


}
