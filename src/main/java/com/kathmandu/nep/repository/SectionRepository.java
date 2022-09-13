package com.kathmandu.nep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kathmandu.nep.entity.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer>{
	List<Section> findBySectionName(String sectionName);

}
