package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import antlr.collections.List;

public class Student_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		// five sample Student instances in an ArrayList
		ArrayList <Person> Students = new ArrayList<Person>();
		/*Students.add(new Student(“Thomas”, “Joseph”, “Jones”, 01/01/1996, eMajor.CHEM, String Address, “(123)-456-7890”, “tjjones@udel.edu”));
		Students.add(new Student(“Mary”, “Grace”, “Herendez”, 02/02/1997, eMajor.PHYSICS, String Address, “(456)-789-1023”, “mgherendez@udel.edu”));
		Students.add(new Student(“Hannah”, “Starr”, “Sea”, 03/03/1998, eMajor.NURSING, String Address, “(789)-102-3456”, “hssea@udel.edu”));
		Students.add(new Student(“Chester”, “Bona”, “Napoleon”, 04/04/1995, eMajor.PHYSICS, String Address, “(132)-546-8790”, “cbnapolean@udel.edu”));
		Students.add(new Student(“Florence”, “Ana”, “Machine”, 05/15/1995, eMajor.COMPSI, String Address, “(546)-879-1023”, “famachine@udel.edu”));*/
		assertEquals(1, 1);
	}
}