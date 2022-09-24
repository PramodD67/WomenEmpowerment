package com.lti.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.Course;
import com.lti.entity.UserRegistration;

@Repository
public interface CourseRepository extends JpaRepository <Course, Integer> {
	 
	 
	} 