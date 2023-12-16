package com.greatlearning.email.service;

import java.util.Random;

import com.greatlearning.email.model.Employee;

public class CredentialServiceImpl implements AdminSupport{
	
	Random random =new Random();
	private final int PASSWORD_LENGTH = 8;
	
	@Override
	public String generateAndSetEmailAdress(Employee employee) {
		String emailAddr = employee.getFirstName()+employee.getLastName()+"@"+employee.getDepartment()+COMPANY_NAME;
		//System.out.println(" Your generated email credentilas are as follows:");
		//System.out.println("Email  --->"+ emailAddr);
		employee.setEmailaddress(emailAddr);
		return emailAddr;
	}
	@Override
	public String generateAndSetPassword(Employee employee) {
		String password ="";
		
		for (int i=0; i<PASSWORD_LENGTH;i++){
			password = password + ALL_PASSWORD_CHARS.charAt(random.nextInt(ALL_PASSWORD_CHARS.length()));
			
}
		employee.setPassword(password);
		return password;
	}
	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstName()+" "+ employee.getLastName());
		System.out.println(" Your generated email credentilas are as follows:");
		System.out.println("Email  ---> "+ employee.getEmailaddress());
		System.out.println("Password  --->"+ employee.getPassword());
	}
	
}		

