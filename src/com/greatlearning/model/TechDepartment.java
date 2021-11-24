package com.greatlearning.model;

public class TechDepartment extends SuperDepartment{
	/* Tech Department is a child class which extends the 
	 parent class Super Department */
	
		// This method is used to return the department name
		public String departmentName() {		
			
			return " Tech Department ";
		}
		
		// This method is used to return todays work
		public String getTodaysWork() {			
				
			return " Complete coding of module 1";
		}
		
		// This method is used to return work deadline
		public String getWorkDeadline() {			
				
			return " Complete by EOD ";
		}
		
		//This method is used to return the Tech Stack information
		public String getTechStackInformation () {			
				
			return "core Java";
		}
}
