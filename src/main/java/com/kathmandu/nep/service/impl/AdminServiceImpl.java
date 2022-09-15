package com.kathmandu.nep.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kathmandu.nep.entity.Branch;
import com.kathmandu.nep.entity.Classroom;
import com.kathmandu.nep.entity.Section;
import com.kathmandu.nep.exceptionHandler.ResourceNotFoundException;
import com.kathmandu.nep.payloads.BranchDto;
import com.kathmandu.nep.payloads.ClassroomDto;
import com.kathmandu.nep.payloads.SectionDto;
import com.kathmandu.nep.repository.BranchRepository;
import com.kathmandu.nep.repository.ClassroomRepository;
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
	@Autowired
	private ClassroomRepository classroomRepository;

	@Override
	public BranchDto addBranch(BranchDto branchDto) {
		Branch branch = this.modelMapper.map(branchDto, Branch.class);
		Branch addedBranch = this.branchRepository.save(branch);
		return this.modelMapper.map(addedBranch, BranchDto.class);
	}

	@Override
	public BranchDto getBranchById(Integer branchId) {
		Branch branch = this.branchRepository.findById(branchId)
				.orElseThrow(() -> new ResourceNotFoundException("Branch", "branch id", branchId.toString()));

		return this.modelMapper.map(branch, BranchDto.class);
	}

	@Override
	public List<BranchDto> getAllBranch() {
		List<Branch> branchList = this.branchRepository.findAll();
		List<BranchDto> branchDtoList = branchList.stream()
				.map((branchDto) -> this.modelMapper.map(branchDto, BranchDto.class)).collect(Collectors.toList());
		return branchDtoList;
	}

	@Override
	public BranchDto updateBranch(BranchDto branchDto, Integer branchId) {
		Branch branch = this.branchRepository.findById(branchId)
				.orElseThrow(() -> new ResourceNotFoundException("Branch", "branch id", branchId.toString()));
		branch = this.modelMapper.map(branchDto, Branch.class);
		Branch updatedBranch = this.branchRepository.save(branch);
		return this.modelMapper.map(updatedBranch, BranchDto.class);
	}

	@Override
	public void deleteBranch(Integer branchId) {
		Branch branch = this.branchRepository.findById(branchId)
				.orElseThrow(() -> new ResourceNotFoundException("Branch", "Branch id", branchId.toString()));
		this.branchRepository.delete(branch);

	}
	// Branch operations end here

	// classroom Operation Start here

	@Override
	public ClassroomDto addClassroom(ClassroomDto classroomDto) {
		Classroom classroom = this.modelMapper.map(classroomDto, Classroom.class);
		Classroom addedClassroom = this.classroomRepository.save(classroom);
		return this.modelMapper.map(addedClassroom, ClassroomDto.class);
	}

	@Override
	public ClassroomDto getClassroomById(Integer classroomId) {
		Classroom classroom = this.classroomRepository.findById(classroomId)
				.orElseThrow(() -> new ResourceNotFoundException("Classroom", "classroom id", classroomId.toString()));
		return this.modelMapper.map(classroom, ClassroomDto.class);
	}

	@Override
	public List<ClassroomDto> getAllClassroom() {
		List<Classroom> classroomList = classroomRepository.findAll();
		List<ClassroomDto> classroomDtoList = classroomList.stream()
				.map((classroomDto) -> this.modelMapper.map(classroomDto, ClassroomDto.class))
				.collect(Collectors.toList());
		return classroomDtoList;
	}

	@Override
	public ClassroomDto updateClassroom(ClassroomDto classroomDto, Integer classroomId) {
		Classroom classroom = this.classroomRepository.findById(classroomId)
				.orElseThrow(() -> new ResourceNotFoundException("Classroom", "classroom id", classroomId.toString()));
		classroom = this.modelMapper.map(classroomDto, Classroom.class);
		Classroom updated = this.classroomRepository.save(classroom);
		return this.modelMapper.map(updated, ClassroomDto.class);
	}

	@Override
	public void deleteClassroom(Integer classroomId) {
		Classroom classroom = this.classroomRepository.findById(classroomId)
				.orElseThrow(() -> new ResourceNotFoundException("Classroom", "classroom id", classroomId.toString()));
		this.classroomRepository.delete(classroom);

	}

	// classroom Operation ends here
	
	//CRUD section operation start here

	@Override
	public List<SectionDto> getAllSection() {
		List<Section> sectionList = this.sectionRepository.findAll();
		List<SectionDto> sectionDtoList = sectionList.stream()
				.map((sectionDto) -> this.modelMapper.map(sectionDto, SectionDto.class)).collect(Collectors.toList());

		return sectionDtoList;
	}

	@Override
	public SectionDto addSection(SectionDto sectionDto) {
		Section section = this.modelMapper.map(sectionDto, Section.class);
		section = this.sectionRepository.save(section);
		return this.modelMapper.map(section, SectionDto.class);
	}

	@Override
	public SectionDto getSectionById(Integer sectionId) {
		Section section = this.sectionRepository.findById(sectionId)
				.orElseThrow(() -> new ResourceNotFoundException("Section", "section id", sectionId.toString()));
		return this.modelMapper.map(section, SectionDto.class);
	}

	@Override
	public SectionDto updateSection(SectionDto sectionDto, Integer sectionId) {
		Section section = this.sectionRepository.findById(sectionId)
				.orElseThrow(() -> new ResourceNotFoundException("Section", "section id", sectionId.toString()));
		section = this.modelMapper.map(sectionDto, Section.class);
		Section updatedSection = this.sectionRepository.save(section);
		return this.modelMapper.map(updatedSection, SectionDto.class);
	}

	@Override
	public void deleteSection(Integer sectionId) {
		Section section = this.sectionRepository.findById(sectionId)
				.orElseThrow(() -> new ResourceNotFoundException("Section", "section id", sectionId.toString()));
		this.sectionRepository.delete(section);

	}	
	//CRUD section operation ends here
	
	
	

}
