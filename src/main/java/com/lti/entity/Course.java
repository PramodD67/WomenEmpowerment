package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Course")
public class Course {

	@Id
	
	private int courseid;
	private String coursename;
	private String duaration;
	
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getDuaration() {
		return duaration;
	}
	public void setDuaration(String duaration) {
		this.duaration = duaration;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", duaration=" + duaration + "]";
	}

	
	
	
	
}
