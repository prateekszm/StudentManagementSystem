package com.kathmandu.nep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kathmandu.nep.payloads.ApiResponse;
import com.kathmandu.nep.payloads.BranchDto;
import com.kathmandu.nep.payloads.ClassroomDto;
import com.kathmandu.nep.payloads.ExamDto;
import com.kathmandu.nep.payloads.SectionDto;
import com.kathmandu.nep.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping("addBranch/")
	public ResponseEntity<BranchDto> createBranch(@RequestBody BranchDto branchDto) {
		BranchDto addedBranchDto = this.adminService.addBranch(branchDto);
		return new ResponseEntity<>(addedBranchDto, HttpStatus.CREATED);

	}

	@GetMapping("allBranch/")
	public ResponseEntity<List<BranchDto>> getAllBranchs() {
		return ResponseEntity.ok(this.adminService.getAllBranch());
	}

	@GetMapping("getBranch/{branchId}")
	public ResponseEntity<BranchDto> getBranchById(@PathVariable Integer branchId) {
		BranchDto branchDto = this.adminService.getBranchById(branchId);
		return ResponseEntity.ok(branchDto);
	}

	@PutMapping("updateBranch/{branchId}")
	public ResponseEntity<BranchDto> updateBranch(@RequestBody BranchDto branchDto, @PathVariable Integer branchId) {
		BranchDto updatedBranchDto = this.adminService.updateBranch(branchDto, branchId);
		return ResponseEntity.ok(updatedBranchDto);
	}

	@DeleteMapping("deleteBranch/{branchId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer branchId) {
		this.adminService.deleteBranch(branchId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Deleted Sucessfully", true), HttpStatus.OK);
	}

////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("addClassroom/")
	public ResponseEntity<ClassroomDto> createClassroom(@RequestBody ClassroomDto classroomDto) {
		ClassroomDto addedClassroomDto = this.adminService.addClassroom(classroomDto);
		return new ResponseEntity<>(addedClassroomDto, HttpStatus.CREATED);

	}

	@GetMapping("getAllClassroom/")
	public ResponseEntity<List<ClassroomDto>> getAllClassroom() {
		return ResponseEntity.ok(this.adminService.getAllClassroom());
	}

	@GetMapping("getClassroom/{classroomId}")
	public ResponseEntity<ClassroomDto> getClassroomById(@PathVariable Integer classroomId) {
		ClassroomDto classroomDto = this.adminService.getClassroomById(classroomId);
		return ResponseEntity.ok(classroomDto);
	}

	@PutMapping("updateClassroom/{classroomId}")
	public ResponseEntity<ClassroomDto> updateClassroom(@RequestBody ClassroomDto classroomDto,
			@PathVariable Integer classroomId) {
		ClassroomDto updatedClassroomDto = this.adminService.updateClassroom(classroomDto, classroomId);
		return ResponseEntity.ok(updatedClassroomDto);
	}

	@DeleteMapping("deleteClass/{classroomId}")
	public ResponseEntity<ApiResponse> deleteClassroom(@PathVariable Integer classroomId) {
		this.adminService.deleteClassroom(classroomId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Deleted Sucessfully", true), HttpStatus.OK);
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping("getAllSection/")
	public ResponseEntity<List<SectionDto>> getAllSection() {
		return ResponseEntity.ok(this.adminService.getAllSection());
	}
	
	@GetMapping("getSectionById/{sectionId}")
	public ResponseEntity<SectionDto> getSectionById(@PathVariable Integer sectionId){
		return ResponseEntity.ok(this.adminService.getSectionById(sectionId));
	}

	@PostMapping("addSection/")
	public ResponseEntity<SectionDto> addSection(@RequestBody SectionDto sectionDto){
		SectionDto addedSectionDto = this.adminService.addSection(sectionDto);
		return new ResponseEntity<>(addedSectionDto,HttpStatus.CREATED);
	}
	
	@PostMapping("updateSection/{sectionId}")
	public ResponseEntity<SectionDto> updateSection(@RequestBody SectionDto sectionDto, @PathVariable Integer sectionId){
		SectionDto updatedSectionDto = this.adminService.updateSection(sectionDto, sectionId);
		return ResponseEntity.ok(updatedSectionDto);
	}
	
	@PostMapping("/deleteSection/{sectionId}")
	public ResponseEntity<ApiResponse> deleteSection(@PathVariable Integer SectionId) {
		this.adminService.deleteSection(SectionId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Deleted Sucessfully", true), HttpStatus.OK);
	}
	
	////////////////////////////////////////////////////////////////////////////////////
	
	@PostMapping("addExam/")
	public ResponseEntity<ExamDto> addExam(@RequestBody ExamDto examDto){
		ExamDto AddedExamDto= this.adminService.addExam(examDto);
		return new ResponseEntity<>(AddedExamDto,HttpStatus.CREATED);
	}
	
	@GetMapping("getAllExam/")
	public ResponseEntity<List<ExamDto>> getAllExam(){
		List<ExamDto> examDtoList = this.adminService.getAllExam();
		return ResponseEntity.ok(examDtoList);
	}
	
	@GetMapping("getExamById/{examId}")
	public ResponseEntity<ExamDto> getExamById(@PathVariable Integer examId){
		ExamDto examDto = this.adminService.getExamById(examId);
		return ResponseEntity.ok(examDto);
	}
	
	@PostMapping("updateExam/{examId}")
	public ResponseEntity<ExamDto> updateExam(@RequestBody ExamDto examDto,@PathVariable Integer examId){
		ExamDto updatedExamDto = this.adminService.updateExam(examDto,examId);
		return  ResponseEntity.ok(updatedExamDto);
	}
	
	@DeleteMapping("deleteExam/{examId}")
	public ResponseEntity<ApiResponse> deleteExam(@PathVariable Integer examId){
		this.adminService.deleteExam(examId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Deleted Sucessfully", true),HttpStatus.OK);
	}
	
	
	
}
