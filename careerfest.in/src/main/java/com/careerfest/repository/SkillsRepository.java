package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.Skills;

@Repository
public interface SkillsRepository extends CrudRepository <Skills, Long>{

	Iterable<Skills> findAll();
	
}
