package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	// attributes include SectionID (UUID), StudentID (UUID), EnrollmentID (UUID) and Grade (double)
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	// no-arg constructor
	private Enrollment() {
		
	}
	
	// two-arg constructor
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
	// getters and setters
	
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	
	public void setEnrollmentID(UUID EnrollmentID) {
		this.EnrollmentID = EnrollmentID;
	}
	public void setGrade(double Grade) {
		this.Grade = Grade;
	}
	
}
