package com.kathmandu.nep.service;

import java.util.List;

import com.kathmandu.nep.payloads.ClassroomDto;
import com.kathmandu.nep.payloads.StudentDto;
import com.kathmandu.nep.payloads.SubjectDto;
import com.kathmandu.nep.payloads.TimeTableDto;


public interface TeacherService {
	StudentDto addStudent(StudentDto studentDto);
	StudentDto getStudentById(Integer studentId);
	List<StudentDto> getAllStudent();
	StudentDto updateStudent(StudentDto studentDto,Integer studentId);	
	void deleteStudent(Integer studentId);
	
	
	//subject
	SubjectDto addSubject(SubjectDto subjectDto);
	SubjectDto getSubjectById(Integer subjectId);
	List<SubjectDto> getAllSubject();
	SubjectDto updateSubject(SubjectDto subjectDto,Integer subjectId);	
	void deleteSubject(Integer subjectId);
	
	// TimeTable 
	TimeTableDto addTimeTable(TimeTableDto timeTableDto);
	TimeTableDto getTimeTableById(Integer timeTableId);
	List<TimeTableDto> getAllTimeTable();
	TimeTableDto updateTimeTable(TimeTableDto timeTableDto, Integer timeTableId);
	void deleteTimeTable(Integer timeTableId);
	List<TimeTableDto> getTimeTableByClassroom(ClassroomDto classroomDto, Integer classroomId);

}

