package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.Employer;
import com.careerfest.model.User;


@Repository
public interface EmpRepository extends CrudRepository <Employer, Long> {

	Employer findByeEmail(String email);
	Employer findByEEmailAndEPassword(String email,String rpassword);
}