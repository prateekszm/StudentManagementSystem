package com.kathmandu.nep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kathmandu.nep.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{
	List<Branch> findByName(String name);
	
}
