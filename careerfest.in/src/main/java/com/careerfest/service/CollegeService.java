package com.careerfest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.careerfest.model.College;
import com.careerfest.repository.CollegeRepository;


@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepository collegerepository;

	public List<College> findAll(){
		return collegerepository.findAll();
		
	}

}
