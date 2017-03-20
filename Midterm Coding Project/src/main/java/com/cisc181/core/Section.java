package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	// Attributes
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	
	// Constructors
	public Section(){
		SectionID = UUID.randomUUID();
	}
	
	public Section(UUID CourseID, UUID SemesterID, int RoomID) {
		SectionID = UUID.randomUUID();
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.RoomID = RoomID;
	}
	
	// Getters 
	public UUID getCourseID(){
		return CourseID;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	
	public int getRoomID() {
		return RoomID;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}
	
	
	// Setters 
	
	public void setCourseID(UUID CourseID) {
		this.CourseID = CourseID;
	}
	
	public void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}
	
	public void setRoomID(int RoomID) {
		this.RoomID = RoomID;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
