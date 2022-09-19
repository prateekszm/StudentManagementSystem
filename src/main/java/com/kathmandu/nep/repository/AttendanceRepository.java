package com.kathmandu.nep.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kathmandu.nep.entity.Attendance;
import com.kathmandu.nep.entity.Classroom;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
	List<Attendance> findByClassroomAndDate(Classroom classroom,Date date);
}
