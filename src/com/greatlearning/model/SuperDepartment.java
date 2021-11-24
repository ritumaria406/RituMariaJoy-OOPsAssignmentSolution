package com.greatlearning.model;

public class SuperDepartment {
	// This is the super class which is  extended by child class
	
		// This method is used to return the department name
		public String departmentName() {	
		
			return " Super Department ";
		}
	
		// This method is used to return todays work
		public String getTodaysWork() {		
			
			return " No Work as of now";
		}
	
		// This method is used to return work deadline
		public String getWorkDeadline() {		
			
			return " Nil ";
		}
	
		// This method is used to return whether today is a holiday
		public String isTodayAHoliday() {		
			
			return " Today is not a holiday";
		}
}
