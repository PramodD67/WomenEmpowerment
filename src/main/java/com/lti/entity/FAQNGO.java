package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FAQNGO")
public class FAQNGO {
	
	@Id
	 private String ngo_username;
	 private String ngo_faq_qtn;
	 private String ngo_faq_ans;

	public String getNgo_faq_qtn() {
		return ngo_faq_qtn;
	}
	public void setNgo_faq_qtn(String ngo_faq_qtn) {
		this.ngo_faq_qtn = ngo_faq_qtn;
	}
	public String getNgo_faq_ans() {
		return ngo_faq_ans;
	}
	public void setNgo_faq_ans(String ngo_faq_ans) {
		this.ngo_faq_ans = ngo_faq_ans;
	}
	public String getNgo_username() {
		return ngo_username;
	}
	public void setNgo_username(String ngo_username) {
		this.ngo_username = ngo_username;
	}
	@Override
	public String toString() {
		return "FAQNGO [ngo_faq_qtn=" + ngo_faq_qtn + ", ngo_faq_ans=" + ngo_faq_ans + ", ngo_username=" + ngo_username
				+ "]";
	}
	 
	 
	 
	 
	 

}
