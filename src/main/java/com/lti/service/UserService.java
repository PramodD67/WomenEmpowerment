package com.lti.service;

import java.util.List;

import com.lti.entity.UserRegistration;
import com.lti.exceptions.NoUserFoundException;

public interface UserService {

	
	
	public UserRegistration createStudent(UserRegistration u);
	
	public List<UserRegistration > listOfDetails();	

	
	
}
