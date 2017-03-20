package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {
	
	// Attributes
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	
	// Constructors
	public Semester() { 
		
	}
	
	public Semester(Date StartDate, Date EndDate) {
		SemesterID = UUID.randomUUID();
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	// Getters
	public Date getStartDate() {
		return StartDate;
	}
	
	public Date getEndDate() {
		return EndDate;
	}
	
	public UUID getID() {
		return SemesterID;
	}
	
	
	// Setters
	public void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}
	
	public void setEndDate(Date EndDate) {
		this.EndDate = EndDate;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
