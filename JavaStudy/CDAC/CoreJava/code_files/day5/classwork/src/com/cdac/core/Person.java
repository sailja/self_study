/**
 * 
 */
package com.cdac.core;

/**
 * @author Umang Sharma
 *
 */
public abstract class Person {

	private int seatNo;
	private String firstName, lastName;
	
	private static int seatCounter;
	
	public Person(String firstName, String lastName) {
		this.seatNo = ++seatCounter;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return "Seat No.: " + seatNo + "\nFirst Name: " + firstName + "\nLast Name: " + lastName;
	}
	
	public abstract void introduce();
}
