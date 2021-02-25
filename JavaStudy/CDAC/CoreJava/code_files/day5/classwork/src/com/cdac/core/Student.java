/**
 * 
 */
package com.cdac.core;

/**
 * @author Umang Sharma
 *
 */
public class Student extends Person {

	private int gradYear;
	private String courseName;
	
	public Student(String firstName, String lastName, int gradYear, String courseName) {
		super(firstName, lastName);
		this.gradYear = gradYear;
		this.courseName = courseName;
	}
	
	@Override
	public void introduce() {
		System.out.println("Hi. My name is " + super.getFirstName() + " and I graduated in " + this.gradYear);
	}
	
	public void feedback() {
		System.out.println("Feedback Submitted");
	}
	
	@Override
	public String toString() {
		return "Student Details:\n" + super.toString() + "\nGrad Year: " + gradYear + "\nCourse Name: " + courseName;
	}
}
