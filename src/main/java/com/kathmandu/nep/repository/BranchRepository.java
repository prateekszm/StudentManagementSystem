package com.kathmandu.nep.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kathmandu.nep.entity.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Integer>{
	
}
