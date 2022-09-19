package com.kathmandu.nep.service;

import java.util.List;

import com.kathmandu.nep.payloads.BranchDto;
import com.kathmandu.nep.payloads.ClassroomDto;
import com.kathmandu.nep.payloads.ExamDto;
import com.kathmandu.nep.payloads.SectionDto;
import com.kathmandu.nep.payloads.TeacherDto;


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
	
	
	//CRUD Section
	List<ExamDto> getAllExam();
	ExamDto addExam(ExamDto examDto);
	ExamDto getExamById(Integer examId);
	ExamDto updateExam(ExamDto examDto,Integer examId);
	void deleteExam(Integer examId);
	
	
	//CRUD Teacher
	TeacherDto addTeacher(TeacherDto teacherDto);
	TeacherDto getTeacherById(Integer teacherId);
	List<TeacherDto> getAllTeacher();
	TeacherDto updateTeacher(TeacherDto teacherDto,Integer teacherId);	
	void deleteTeacher(Integer teacherId);
	
	
	
	
	
	

	

}
