package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.CourseRepository;
import com.lti.dao.FAQNGORepository;
import com.lti.entity.Course;
import com.lti.entity.FAQNGO;


@Service
public class FAQNGOServiceImpl  implements FAQNGOService {
	@Autowired
	private FAQNGORepository faqngoRepo;

//	@Transactional
//	@Override
//	public FAQNGO createNGOUsername(FAQNGO u) {
//		// TODO Auto-generated method stub
//		return 	faqngoRepo.save(u);
//	}
	
	@Transactional
	@Override
	public FAQNGO createQuestion(FAQNGO q) {
		// TODO Auto-generated method stub
		return 	faqngoRepo.save(q);
	}
	
	@Transactional
	@Override
	public FAQNGO createAnswer(FAQNGO a) {
		// TODO Auto-generated method stub
		return faqngoRepo.save(a);
	}
	
	


	@Override
	public List<FAQNGO> listOfQtns() {
		// TODO Auto-generated method stub
		return faqngoRepo.findAll();
	}

	@Override
	public List<FAQNGO> listOfAns() {
		// TODO Auto-generated method stub
		return faqngoRepo.findAll();
	}
	
	
}