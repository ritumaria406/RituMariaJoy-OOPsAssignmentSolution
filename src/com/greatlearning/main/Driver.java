package com.greatlearning.main;
import com.greatlearning.model.*;

public class Driver {	
	
	// Main method to create objects and call methods
	public static void main(String[] args) {
		
		//Create an object of class Admin Department
		 SuperDepartment objAdmin = new AdminDepartment();
		 
		// Display the details of Admin Department class
		System.out.println(" Welcome to" + objAdmin.departmentName());
		System.out.println(objAdmin.getTodaysWork());
			
		// Used trim method to remove the before and after space as its not expected in the output
		System.out.println(objAdmin.getWorkDeadline().trim()); 
		System.out.println(objAdmin.isTodayAHoliday().trim() +"\n");
		
		// Create an object of class HR Department
		 HrDepartment objHr = new HrDepartment();
		 
		// Display the details of HR Department class
		 
		//Fetching the Tech stack information
		String departmentName = objHr.departmentName().trim();
			
		//Changing the First char of the string as upper case and appending remaining string
		String outputDepartmentName = departmentName.substring(0,2).toUpperCase() + departmentName.substring(2,departmentName.length());
			
		System.out.println(" Welcome to " + outputDepartmentName);
		System.out.println(objHr.doActivity());
			
		// Used trim method to remove the before and after space as its not expected in the output
		System.out.println(objHr.getTodaysWork().trim());
		System.out.println(objHr.getWorkDeadline().trim());
		System.out.println(objHr.isTodayAHoliday().trim() + "\n");
			
		
		// Create an object of class Tech Department
		 TechDepartment objTech = new TechDepartment();		
		
		// Display the details of Tech Department class
		System.out.println(" Welcome to" + objTech.departmentName());
		System.out.println(objTech.getTodaysWork().trim());
		
		// Used trim method to remove the before and after space as its not expected in the output
		System.out.println(objTech.getWorkDeadline().trim());
		
		//Fetching the Tech stack information
		String techStack = objTech.getTechStackInformation();
		
		//Changing the First char of the string as upper case and appending remaining string
		String outputTechStack = techStack.substring(0,1).toUpperCase() + techStack.substring(1,techStack.length());
		
		System.out.println(" "+outputTechStack);
		System.out.println(objTech.isTodayAHoliday().trim());
	}	
	
}
