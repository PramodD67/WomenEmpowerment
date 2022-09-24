package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.CourseRepository;
import com.lti.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository cRepo;
	
	
	@Transactional
	@Override
	public Course createCourse(Course c) {
		// TODO Auto-generated method stub
		return  cRepo.save(c);
	}

	@Override
	public List<Course> listOfCourse() {
		// TODO Auto-generated method stub
	 return	cRepo.findAll();
	}
	


	
}
