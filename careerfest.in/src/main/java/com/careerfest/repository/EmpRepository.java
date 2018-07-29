package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.Employer;


@Repository
public interface EmpRepository extends CrudRepository <Employer, Long> {

	Employer findByeEmail(String email);
}