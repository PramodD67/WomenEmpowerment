package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.lti.dao.UserRepository;

import com.lti.entity.UserRegistration;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository uRepo;
	
	
	@Transactional
	@Override
	public UserRegistration createStudent(UserRegistration u) {
		// TODO Auto-generated method stub
		return  uRepo.save(u);
	}

	@Override
	public List<UserRegistration> listOfDetails() {
		// TODO Auto-generated method stub
	 return	uRepo.findAll();
	}
	


	
	



}
