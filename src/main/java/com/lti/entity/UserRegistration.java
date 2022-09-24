package com.lti.entity;

import javax.persistence.*;

@Entity
@Table(name="UserRegistration")
public class UserRegistration {

	@Id
	 private long aadharno;
	 private String fname;
	 private String dob;
	 private  String mstatus;
	 private String spname;
	 private int nokids;
	 private long phno;
	 private String email;
	 private int courseid;
	 private String coursename;
	 
	 
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMstatus() {
		return mstatus;
	}
	public void setMstatus(String mstatus) {
		this.mstatus = mstatus;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public int getNokids() {
		return nokids;
	}
	public void setNokids(int nokids) {
		this.nokids = nokids;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	@Override
	public String toString() {
		return "UserRegistration [aadharno=" + aadharno + ", fname=" + fname + ", dob=" + dob + ", mstatus=" + mstatus
				+ ", spname=" + spname + ", nokids=" + nokids + ", phno=" + phno + ", email=" + email + ", courseid="
				+ courseid + ", coursename=" + coursename + "]";
	}
	 
	 
	 


	
	
	 
	 
	 
	 
	
	
}
