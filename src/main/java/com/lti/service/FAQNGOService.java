package com.lti.service;

import java.util.List;


import com.lti.entity.FAQNGO;

public interface FAQNGOService {
	
	public FAQNGO createQuestion(FAQNGO q);
	
	public FAQNGO createAnswer(FAQNGO a);
	
//	public FAQNGO createNGOUsername(FAQNGO n);
	
	public List<FAQNGO> listOfQtns();	
	
	public List<FAQNGO> listOfAns();	

	
	
}
