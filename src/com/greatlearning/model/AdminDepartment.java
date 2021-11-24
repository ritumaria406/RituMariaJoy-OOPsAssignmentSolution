package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment{
	/* Admin Department is a child class which extends the 
	 parent class Super Department */
	
		//This method is used to return the department name
		public String departmentName() {		
			
			return " Admin Department ";
		}
		
		// This method is used to return todays work
		public String getTodaysWork() {		
				
			return "Complete your documents Submission";
		}
		
		// This method is used to return work deadline
		public String getWorkDeadline() {			
				
			return " Complete by EOD ";
		}
}
