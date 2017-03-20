package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	// Attributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		EnrollmentID = UUID.randomUUID();
		
				
	}
	
	
	public void setGrade(double grade){
		this.Grade = grade;
	}
}
