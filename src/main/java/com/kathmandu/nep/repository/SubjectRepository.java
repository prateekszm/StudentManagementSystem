package com.kathmandu.nep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kathmandu.nep.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
	List<Subject> findByName(String name);
}
