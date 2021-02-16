/**
Problem Statement: Sub-class of Person.java to learn more about inheritence.
 */
 package com.app.core;
 public class Student extends Person{

     private int gradYear;
     
     public Student(String firstName, String lastName, int gradYear) {
         super(firstName, lastName);
         this.gradYear = gradYear;
     }

     public String toString() {
         return "Student Info:\n" + super.toString() + "\nGraduation Year: " + gradYear;
     }
 }