package com.careerfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.User;
import com.careerfest.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userrepository;

	public User findByEmail(String email){
		return userrepository.findByEmail(email);		
	}
    public User registerUser(User user){
		
		User saveuser =  userrepository.save(user);
		return saveuser;
				 
	}
	
}
