package com.careerfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.Skills;
import com.careerfest.repository.SkillsRepository;


@Service
public class SkillsService {
	
	@Autowired
	private SkillsRepository skillsrepository;

	public Iterable<Skills> findAll(){
		return skillsrepository.findAll();
		
	}

}
