package com.lti.service;

import java.util.List;

import com.lti.entity.NGO;



public interface NGOService {
	
	public NGO createUser(NGO n);
	
	public List<NGO> listOfNGO();	

	
}
