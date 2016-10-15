package com.cisc181.core;

import java.util.UUID;

public class Section {
	// attributes include CourseID (UUID), SemesterID (UUID), SectionID (UUID), RoomID (int)
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	// getters and setters
	public UUID getCourseID() {
		return CourseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setSectionID(UUID sectionID) {
		this.SectionID = SectionID;
	}
	public void setRoomID(int roomID) {
		this.RoomID = RoomID;
	}
	
}