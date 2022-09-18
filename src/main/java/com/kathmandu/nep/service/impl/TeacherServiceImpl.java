package com.kathmandu.nep.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kathmandu.nep.entity.Classroom;
import com.kathmandu.nep.entity.Student;
import com.kathmandu.nep.entity.Subject;
import com.kathmandu.nep.entity.TimeTable;
import com.kathmandu.nep.exceptionHandler.ResourceNotFoundException;
import com.kathmandu.nep.payloads.ClassroomDto;
import com.kathmandu.nep.payloads.StudentDto;
import com.kathmandu.nep.payloads.SubjectDto;
import com.kathmandu.nep.payloads.TimeTableDto;
import com.kathmandu.nep.repository.ClassroomRepository;
import com.kathmandu.nep.repository.StudentRepository;
import com.kathmandu.nep.repository.SubjectRepository;
import com.kathmandu.nep.repository.TimeTableRepository;
import com.kathmandu.nep.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	SubjectRepository subjectRepository;
	@Autowired
	TimeTableRepository timeTableRepository;

	@Autowired
	ClassroomRepository classroomRepository;

	@Override
	public List<StudentDto> getAllStudent() {
		List<Student> studentList = this.studentRepository.findAll();
		List<StudentDto> studentDtoList = studentList.stream()
				.map((studentDto) -> this.modelMapper.map(studentDto, StudentDto.class)).collect(Collectors.toList());
		return studentDtoList;
	}

	@Override
	public StudentDto addStudent(StudentDto studentDto) {
		this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Student student = this.modelMapper.map(studentDto, Student.class);
		Student addedStudent = this.studentRepository.save(student);
		return this.modelMapper.map(addedStudent, StudentDto.class);
	}

	@Override
	public StudentDto getStudentById(Integer studentId) {
		Student student = this.studentRepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "student id", studentId.toString()));
		return this.modelMapper.map(student, StudentDto.class);
	}

	@Override
	public StudentDto updateStudent(StudentDto studentDto, Integer studentId) {
		Student student = this.studentRepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "student id", studentId.toString()));
		student = this.modelMapper.map(studentDto, Student.class);
		return this.modelMapper.map(this.studentRepository.save(student), StudentDto.class);
	}

	@Override
	public void deleteStudent(Integer studentId) {
		Student student = this.studentRepository.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "student id", studentId.toString()));
		this.studentRepository.delete(student);
	}

	@Override
	public List<SubjectDto> getAllSubject() {
		List<Subject> subjectList = this.subjectRepository.findAll();
		List<SubjectDto> subjectDtoList = subjectList.stream()
				.map((subjectDto) -> this.modelMapper.map(subjectDto, SubjectDto.class)).collect(Collectors.toList());
		return subjectDtoList;
	}

	// Subject

	@Override
	public SubjectDto addSubject(SubjectDto subjectDto) {
		Subject subject = this.modelMapper.map(subjectDto, Subject.class);
		Subject addedSubject = this.subjectRepository.save(subject);
		return this.modelMapper.map(addedSubject, SubjectDto.class);
	}

	@Override
	public SubjectDto getSubjectById(Integer subjectId) {
		Subject subject = this.subjectRepository.findById(subjectId)
				.orElseThrow(() -> new ResourceNotFoundException("Subject", "subject id", subjectId.toString()));
		return this.modelMapper.map(subject, SubjectDto.class);
	}

	@Override
	public SubjectDto updateSubject(SubjectDto subjectDto, Integer subjectId) {
		Subject subject = this.subjectRepository.findById(subjectId)
				.orElseThrow(() -> new ResourceNotFoundException("Subject", "subject id", subjectId.toString()));
		subject = this.modelMapper.map(subjectDto, Subject.class);
		return this.modelMapper.map(this.subjectRepository.save(subject), SubjectDto.class);
	}

	@Override
	public void deleteSubject(Integer subjectId) {
		Subject subject = this.subjectRepository.findById(subjectId)
				.orElseThrow(() -> new ResourceNotFoundException("Subject", "subject id", subjectId.toString()));
		this.subjectRepository.delete(subject);
	}

	// timetable

	@Override
	public List<TimeTableDto> getAllTimeTable() {
		List<TimeTable> timeTableList = this.timeTableRepository.findAll();
		List<TimeTableDto> timeTableDtoList = timeTableList.stream()
				.map((timeTableDto) -> this.modelMapper.map(timeTableDto, TimeTableDto.class))
				.collect(Collectors.toList());
		return timeTableDtoList;
	}

	@Override
	public TimeTableDto addTimeTable(TimeTableDto timeTableDto) {
		TimeTable timeTable = this.modelMapper.map(timeTableDto, TimeTable.class);
		TimeTable addedTimeTable = this.timeTableRepository.save(timeTable);
		return this.modelMapper.map(addedTimeTable, TimeTableDto.class);
	}

	@Override
	public TimeTableDto getTimeTableById(Integer timeTableId) {
		TimeTable timeTable = this.timeTableRepository.findById(timeTableId)
				.orElseThrow(() -> new ResourceNotFoundException("TimeTable", "timeTable id", timeTableId.toString()));
		return this.modelMapper.map(timeTable, TimeTableDto.class);
	}

	@Override
	public TimeTableDto updateTimeTable(TimeTableDto timeTableDto, Integer timeTableId) {
		TimeTable timeTable = this.timeTableRepository.findById(timeTableId)
				.orElseThrow(() -> new ResourceNotFoundException("TimeTable", "timeTable id", timeTableId.toString()));
		timeTable = this.modelMapper.map(timeTableDto, TimeTable.class);
		return this.modelMapper.map(this.timeTableRepository.save(timeTable), TimeTableDto.class);
	}

	@Override
	public void deleteTimeTable(Integer timeTableId) {
		TimeTable timeTable = this.timeTableRepository.findById(timeTableId)
				.orElseThrow(() -> new ResourceNotFoundException("TimeTable", "timeTable id", timeTableId.toString()));
		this.timeTableRepository.delete(timeTable);
	}

	@Override
	public List<TimeTableDto> getTimeTableByClassroom(ClassroomDto classroomDto, Integer classroomId) {

		Classroom classroom = this.classroomRepository.findById(classroomId)
				.orElseThrow(() -> new ResourceNotFoundException("TimeTable", "Classroom id", classroomId.toString()));
		List<TimeTable> timeTableList = this.timeTableRepository.findByClassroom(classroom);
		List<TimeTableDto> timeTableDtoList = timeTableList.stream()
				.map((timeTableDto) -> this.modelMapper.map(timeTableDto, TimeTableDto.class))
				.collect(Collectors.toList());
		return timeTableDtoList;

	}

}
