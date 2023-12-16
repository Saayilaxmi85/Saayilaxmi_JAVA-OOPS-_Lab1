package com.greatlearning.email.service;

import com.greatlearning.email.model.*;

public interface AdminSupport {
	
	 final String COMPANY_NAME =".gl.com";
	 final String LOWER = "abcdefghijklmnopqrstuvwxyz";
	 final String UPPER =LOWER.toUpperCase();
	 final String NUM = "0123456789";
	 final String SPL ="!@#$%^&*()";
	 final String ALL_PASSWORD_CHARS = LOWER + UPPER + NUM + SPL;
	
	String generateAndSetEmailAdress(Employee employee);
	String generateAndSetPassword(Employee employee);
	void showCredentials(Employee employee);


}
