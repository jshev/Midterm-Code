package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	// attributes include CourseID (UUID) , CourseName (String), and GradePoints (int)
	// added Major (String) as an attribute
	// changed Major's type to eMajor
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	// getters and setters
	public UUID getCourseID() {
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
	
	public void setCourseID(UUID courseID) {
		this.CourseID = CourseID;
	}
	public void setCourseName(String courseName) {
		this.CourseName = CourseName;
	}
	public void setGradePoints(int gradePoints) {
		this.GradePoints = GradePoints;
	}
	public void setMajor(eMajor major) {
		this.Major = Major;
	}
	
}