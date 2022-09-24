package com.lti.service;

import java.util.List;

import com.lti.entity.Course;


public interface CourseService {
	
	public Course createCourse(Course c);
	
	public List<Course> listOfCourse();	

	
	
}
