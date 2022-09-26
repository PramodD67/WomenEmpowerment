package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.FAQNGO;
import com.lti.entity.NGO;

@Repository
public interface FAQNGORepository extends JpaRepository <FAQNGO, Integer> {
	 
	 
	} 

