package com.careerfest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.Company;
import com.careerfest.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyrepository;

	public List<Company> findAll(){
		return companyrepository.findAll();
		
	}

}
