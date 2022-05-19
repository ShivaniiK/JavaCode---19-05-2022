package com.AccessModifiers;

public class AccessModifiers {
	 
		//Private
		//ProtectedPublic
		//Default
		
		private String strCollegeName = "Lotus Business Institute";
		public String strbatch = "May 2022";
		protected String strStudentName = "Shivani";
	    String strProjectName = "Predictive Analysis of Machine";
		
		public void printCollegename() {
			System.out.println("College name is: "+strCollegeName);
		}
		public void printProjectName() {
			System.out.println("Project name is: "+strProjectName);
		}
		
		public void printStudentName() {
			System.out.println("Student name is: "+strStudentName);s
		}
		
		public void printBatchName() {
			System.out.println("Batch is: "+strbatch);
		}
		}

		
	

