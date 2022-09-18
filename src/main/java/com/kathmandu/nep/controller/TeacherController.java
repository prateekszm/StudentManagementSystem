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
import com.kathmandu.nep.payloads.ClassroomDto;
import com.kathmandu.nep.payloads.StudentDto;
import com.kathmandu.nep.payloads.SubjectDto;
import com.kathmandu.nep.payloads.TimeTableDto;
import com.kathmandu.nep.service.TeacherService;

@RestController
@RequestMapping("api/teacher")
public class TeacherController {
	@Autowired
	TeacherService teacherService;

	@PostMapping("addStudent/")
	public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto) {
		System.out.println(studentDto.toString());
		StudentDto addedStudentDto = this.teacherService.addStudent(studentDto);
		return new ResponseEntity<>(addedStudentDto, HttpStatus.CREATED);

	}

	@GetMapping("getAllStudent/")
	public ResponseEntity<List<StudentDto>> getAllStudents() {
		return ResponseEntity.ok(this.teacherService.getAllStudent());
	}

	@GetMapping("getStudentById/{studentId}")
	public ResponseEntity<StudentDto> getStudentById(@PathVariable Integer studentId) {
		StudentDto studentDto = this.teacherService.getStudentById(studentId);
		return ResponseEntity.ok(studentDto);
	}

	@PutMapping("updateStudent/{studentId}")
	public ResponseEntity<StudentDto> updateStudent(@RequestBody StudentDto studentDto,
			@PathVariable Integer studentId) {
		StudentDto updatedStudentDto = this.teacherService.updateStudent(studentDto, studentId);
		return ResponseEntity.ok(updatedStudentDto);
	}

	@DeleteMapping("deleteStudent/{studentId}")
	public ResponseEntity<ApiResponse> deleteStudent(@PathVariable Integer studentId) {
		this.teacherService.deleteStudent(studentId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Deleted Sucessfully", true), HttpStatus.OK);
	}

	@PostMapping("addSubject/")
	public ResponseEntity<SubjectDto> createSubject(@RequestBody SubjectDto subjectDto) {
		SubjectDto addedSubjectDto = this.teacherService.addSubject(subjectDto);
		return new ResponseEntity<>(addedSubjectDto, HttpStatus.CREATED);

	}

	@GetMapping("getAllSubject/")
	public ResponseEntity<List<SubjectDto>> getAllSubjects() {
		return ResponseEntity.ok(this.teacherService.getAllSubject());
	}

	@GetMapping("getSubjectById/{subjectId}")
	public ResponseEntity<SubjectDto> getSubjectById(@PathVariable Integer subjectId) {
		SubjectDto subjectDto = this.teacherService.getSubjectById(subjectId);
		return ResponseEntity.ok(subjectDto);
	}

	@PutMapping("updateSubject/{subjectId}")
	public ResponseEntity<SubjectDto> updateSubject(@RequestBody SubjectDto subjectDto,
			@PathVariable Integer subjectId) {
		SubjectDto updatedSubjectDto = this.teacherService.updateSubject(subjectDto, subjectId);
		return ResponseEntity.ok(updatedSubjectDto);
	}

	@DeleteMapping("deleteSubject/{subjectId}")
	public ResponseEntity<ApiResponse> deleteSubject(@PathVariable Integer subjectId) {
		this.teacherService.deleteSubject(subjectId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Deleted Sucessfully", true), HttpStatus.OK);
	}

	// Timetable

	@PostMapping("addTimeTable/")
	public ResponseEntity<TimeTableDto> createTimeTable(@RequestBody TimeTableDto timeTableDto) {
		TimeTableDto addedTimeTableDto = this.teacherService.addTimeTable(timeTableDto);
		return new ResponseEntity<>(addedTimeTableDto, HttpStatus.CREATED);

	}

	@GetMapping("getAllTimeTable/")
	public ResponseEntity<List<TimeTableDto>> getAllTimeTables() {
		return ResponseEntity.ok(this.teacherService.getAllTimeTable());
	}

	@GetMapping("getTimeTableByClassroom/{classroomId}")
	public ResponseEntity<List<TimeTableDto>> getTimeTableByClassroom(@RequestBody ClassroomDto classroomDto,
			@PathVariable Integer classroomId) {
		return ResponseEntity.ok(this.teacherService.getTimeTableByClassroom(classroomDto, classroomId));
	}

	@GetMapping("getTimeTableById/{timeTableId}")
	public ResponseEntity<TimeTableDto> getTimeTableById(@PathVariable Integer timeTableId) {
		TimeTableDto timeTableDto = this.teacherService.getTimeTableById(timeTableId);
		return ResponseEntity.ok(timeTableDto);
	}

	@PutMapping("updateTimeTable/{timeTableId}")
	public ResponseEntity<TimeTableDto> updateTimeTable(@RequestBody TimeTableDto timeTableDto,
			@PathVariable Integer timeTableId) {
		TimeTableDto updatedTimeTableDto = this.teacherService.updateTimeTable(timeTableDto, timeTableId);
		return ResponseEntity.ok(updatedTimeTableDto);
	}

	@DeleteMapping("deleteTimeTable/{timeTableId}")
	public ResponseEntity<ApiResponse> deleteTimeTable(@PathVariable Integer timeTableId) {
		this.teacherService.deleteTimeTable(timeTableId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Deleted Sucessfully", true), HttpStatus.OK);
	}
}
