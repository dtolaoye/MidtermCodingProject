package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	
	// Attributes
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	// Constructors
	public Course (){
		
	}
	
	public Course(String CourseName, int GradePoints, eMajor Major ){
		CourseID = CourseID.randomUUID();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
		
	}
	
	// Getters
	public UUID getID() {
		return CourseID;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public int getGradePoints() {
		return GradePoints;
	}
	
	public eMajor getMajor() {
		return Major;
	}
	
	// Setters
	public void setMajor(eMajor Major) {
		this.Major = Major;
	}
	
	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}
	
	public void setGradePoints(){
		this.GradePoints = GradePoints;
	}
	
	public static void main(String[] args){ 
		
		
	}

}
