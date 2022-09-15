package com.kathmandu.nep.service;

import java.util.List;

import com.kathmandu.nep.payloads.BranchDto;
import com.kathmandu.nep.payloads.ClassroomDto;
import com.kathmandu.nep.payloads.SectionDto;


public interface AdminService {
	
	
	//CRUD Branch
	
	BranchDto addBranch(BranchDto branchDto);
	BranchDto getBranchById(Integer branchId);
	List<BranchDto> getAllBranch();
	BranchDto updateBranch(BranchDto branchDto,Integer branchId);	
	void deleteBranch(Integer branchId);
	
	
	//CRUD ClassRoom
	
	ClassroomDto addClassroom(ClassroomDto classroomDto);
	ClassroomDto getClassroomById(Integer classroomId);
	List<ClassroomDto> getAllClassroom();
	ClassroomDto updateClassroom(ClassroomDto classroomDto,Integer classroomId);
	void deleteClassroom(Integer classroomId);
	
	//CRUD Section
	List<SectionDto> getAllSection();
	SectionDto addSection(SectionDto sectionDto);
	SectionDto getSectionById(Integer sectionId);
	SectionDto updateSection(SectionDto sectionDto,Integer sectionId);
	void deleteSection(Integer sectionId);
	
	
	
	
	
	
	
	

	

}
