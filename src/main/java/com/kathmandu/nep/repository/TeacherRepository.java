package com.kathmandu.nep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kathmandu.nep.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
