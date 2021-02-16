/**
Problem Statement: Core class to learn more information about inheritence. This class will be inherited by Student.java in the same package.
 */
package com.app.core;
public class Person {
    
    private String firstName, lastName;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName;
    }
}