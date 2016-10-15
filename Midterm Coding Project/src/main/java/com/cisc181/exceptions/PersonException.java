package com.cisc181.exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private Person p;
	
	public Person getP() {
		return p;
	}

	public PersonException(String message) {
		super(message);
	}
}