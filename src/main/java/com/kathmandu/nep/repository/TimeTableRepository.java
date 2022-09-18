package com.kathmandu.nep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kathmandu.nep.entity.Classroom;
import com.kathmandu.nep.entity.TimeTable;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable, Integer> {
	List<TimeTable> findByClassroom(Classroom classroom);
}
