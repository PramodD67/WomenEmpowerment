package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.NGORepository;
import com.lti.dao.UserRepository;
import com.lti.entity.NGO;
import com.lti.entity.UserRegistration;

@Service
public class NGOServiceImpl  implements NGOService{

	@Autowired
	private NGORepository nRepo;
	
	
	@Transactional
	@Override
	public NGO createUser(NGO n) {
		// TODO Auto-generated method stub
		return  nRepo.save(n);
	}

	@Override
	public List<NGO> listOfNGO() {
		// TODO Auto-generated method stub
	 return	nRepo.findAll();
}
}
