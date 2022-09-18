package com.kathmandu.nep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kathmandu.nep.entity.Exam;
@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer>{

}
