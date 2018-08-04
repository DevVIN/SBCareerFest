package com.careerfest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.careerfest.model.Role;
import com.careerfest.repository.RoleRepository;


@Service
public class RoleService {
	
	@Autowired
	private RoleRepository rolerepository;

	public List<Role> findAll(){
		return rolerepository.findAll();
		
	}

}
