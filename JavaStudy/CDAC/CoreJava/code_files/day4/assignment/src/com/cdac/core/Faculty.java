/**
 * 
 */
package com.cdac.core;

/**
 * @author Umang Sharma
 *
 */
public class Faculty extends Person {
	
	private int yearsOfEx;
	private String workingDomain;
	
	public Faculty(String firstName, String lastName, int yearsOfEx, String workingDomain) {
		super(firstName, lastName);
		this.yearsOfEx = yearsOfEx;
		this.workingDomain = workingDomain;
	}

	@Override
	public void introduce() {
		System.out.println("Hi. My Last Name is " + super.getLastName() + " and I have " + this.yearsOfEx + " years of working experience.");
	}
	
	public void evaluate() {
		System.out.println("Students Evaluated.");
	}
	
	@Override
	public String toString() {
		return "Faculty Details:\n" + super.toString() + "\nYears of Experience: " + this.yearsOfEx + "\nWorking Domain: " + this.workingDomain;
	}

}
