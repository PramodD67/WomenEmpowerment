package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Course;
import com.lti.entity.FAQNGO;
import com.lti.entity.NGO;
import com.lti.entity.UserRegistration;
import com.lti.exceptions.UserAlreadyExistsException;
import com.lti.service.CourseService;
import com.lti.service.FAQNGOService;
import com.lti.service.NGOService;
import com.lti.service.UserService;



@RestController
public class UserController {

	@Autowired
    private UserService sService;
	@Autowired
    private CourseService cService;
	@Autowired
    private NGOService nService;
	@Autowired
    private FAQNGOService fService;


	//User registration
    @PostMapping("/registration")
	public UserRegistration addUserRegistration(@RequestBody UserRegistration u) {
		return sService.createStudent(u);
	}
     
    @GetMapping("/userdetails")
	public List<UserRegistration> getAllUserRegistration(){
		return sService.listOfDetails();
	}
    
    //Courses
    @PostMapping("/addcourses")
  	public Course addCourse(@RequestBody Course c) {
  		return cService.createCourse(c);
  	}
       
      @GetMapping("/course")
  	public List<Course> getAllCourse(){
  		return cService.listOfCourse();
  	}
      
      //NGO
      @PostMapping("/adduser")
    	public NGO addUser(@RequestBody NGO n)  {
    	  if(n.getUsername().equals(n)) {
    		
             return null;  // Need to throw an exception here
    	  }
    	  else {
    			return nService.createUser(n);
    	  }
	
    	
    	}
         
        @GetMapping("/getuser")
    	public List<NGO> getAllNGO(){
    		return nService.listOfNGO();
    	}
        
        
        //NGO FAQ
        @PostMapping("/ngofaq_addqtn")
      	public FAQNGO addQuestion(@RequestBody FAQNGO q)  {
     
      			return fService.createQuestion(q);
      	  
  	
      	
      	}
        
        @PostMapping("/ngofaq_addans")
       	public FAQNGO addAnswer(@RequestBody FAQNGO a)  {
      
       			return fService.createAnswer(a);
       	  
   	
       	
       	}
        
//        @PostMapping("/ngofaqusername")
//       	public FAQNGO addNgoUser(@RequestBody FAQNGO u)  {
//      
//       			return fService.createNGOUsername(u);
//       	  
//   	
//       	
//       	}
           
          @GetMapping("/getngofaqqtns")
      	public List<FAQNGO> getAllFAQNGOqtns(){
      		return fService.listOfQtns();
      	}
    
          @GetMapping("/getngofaqans")
        	public List<FAQNGO> getAllFAQNGOans(){
        		return fService.listOfAns();
        	}
}
    
 

