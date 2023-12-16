package com.greatlearning.email.driver;

import java.util.Scanner;

import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.AdminSupport;
import com.greatlearning.email.service.CredentialServiceImpl;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AdminSupport credService = new CredentialServiceImpl();
		
		System.out.println("Enter the employee first name");
		String firstName = sc.nextLine();
		
		System.out.println("Enter the employee last name");
		String lastName = sc.nextLine();
		
		
		Employee employee = new Employee(firstName, lastName);
		
		System.out.println("Select the department from the below list");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int dept = sc.nextInt();
		switch(dept) {
		case 1: 
			employee.setDepartment("Technical");
			break;
		case 2: 
			employee.setDepartment("Admin");
			break;
		case 3: 
			employee.setDepartment("HR");
			break;
		case 4: 
			employee.setDepartment("Legal");
			break;
		default: 
			System.out.println("Invalid department Selection");
			
		}
				
		if(employee.getFirstName() != null && employee.getLastName() != null && employee.getDepartment() != null)
		{
			credService.generateAndSetEmailAdress(employee);
			credService.generateAndSetPassword(employee);
			credService.showCredentials(employee);
	}
		
		sc.close();
	}
}	

