package com.greatlearning.model;

public class HrDepartment extends SuperDepartment{
	/* HR Department is a child class which extends the 
	 parent class Super Department */
	
		// This method is used to return the department name
		public String departmentName() {		
			
			return " Hr Department ";
		}
		
		// This method is used to return todays work
		public String getTodaysWork() {			
				
			return " Fill today’s timesheet and mark your attendance";
		}
		
		// This method is used to return work deadline
		public String getWorkDeadline() {			
				
			return " Complete by EOD ";
		}
		
		// This method is used to return do activity
		public String doActivity() {			
				
			return "team Lunch";
		}
}
