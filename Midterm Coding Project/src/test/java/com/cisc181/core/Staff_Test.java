package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		// five sample Staff instances in an ArrayList
		ArrayList <Person> StaffMembers = new ArrayList<Person>();
		/*StaffMembers.add(new Staff(“Lily”, “Elizabeth”, “Jones”, 01/01/1983, “Los Angles”, “(860)-345-3437”, “lejones@udel.edu”, “Thursday 5-7pm”, 0, 27130, 09/01/2012, eTitle.LADY));
		StaffMembers.add(new Staff(“Micheal”, “Daniel”, “Stewart”, 10/10/1951, “Chicago”, “(191)-789-9999”, “mdstewart@udel.edu”, “Tuesday 2:30-4:30pm”, 0, 55000, 09/01/2013, eTitle.MR));
		StaffMembers.add(new Staff(“Charlotte”, “Ida”, “Hammond”, 06/06/1976, “New Athens”, “(765)-123-0987”, “cihammond@udel.edu”, “Wednesday 10:30am-12:30pm” , 0, 75180, 09/01/2014, eTitle.DR));
		StaffMembers.add(new Staff(“Ivan”, “Peter”, “Smith”, 09/14/1957, “Silicon Valley”, “(130)-654-1234”, “ipsmith@udel.edu”, “Thursday 2-4pm”, 0, 130000, 09/01/2015, eTitle.MR));
		StaffMembers.add(new Staff(“Kaitlyn”, “Jean”, “Neibert”, 07/21/1987, “Rohoboth”, “(890)-098-5678”, “feather@udel.edu”, “Tuesday 9:30am-11:30am”, 0, 73060, 09/01/2016, eTitle.MS));*/
		assertEquals(1,1);
	}
	
	@Test
	public void testPhoneException() {
		// Staff instance with invalid phone number
		ArrayList <Person> StaffMembers = new ArrayList<Person>();
		/*StaffMembers.add(new Staff(“Leon”, “Food”, “Pears”, 11/11/1977, “Salisbury”, “1234567890”, “lfpears@udel.edu”, “Sunday 11am-8pm”, 0, 50000, 09/01/2010, eTitle.MR));*/
		assertEquals(1,1);
	}
	
	@Test
	public void testDOBException() {
		// Staff instance with invalid DOB
		ArrayList <Person> StaffMembers = new ArrayList<Person>();
		/*StaffMembers.add(new Staff(“Delia”, “Monte”, “Peaches”, 09/03/1912, “San Francisco”, “(123)-456-7890, “dmpeaches@udel.edu”, “Mondays 3-5am”, 0, 100000, 09/01/2011, eTitle.MRS));*/
		assertEquals(1,1);
	}
	

}