package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {
	// attributes include SemesterID (UUID), StartDate (data), EndDate (date)
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	// getters and setters
	public UUID getSemesterID() {
		return SemesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	
	public void setSemesterID(UUID semesterID) {
		this.SemesterID = SemesterID;
	}
	public void setStartDate(Date startDate) {
		this.StartDate = StartDate;
	}
	public void setEndDate(Date endDate) {
		this.EndDate = EndDate;
	}
	
}