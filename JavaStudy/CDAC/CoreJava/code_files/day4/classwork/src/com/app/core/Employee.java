/*
Problem Statement: Build a core class to be extended by other classes for it's use.
 */
 package com.app.core;
 public abstract class Employee {

     private int id;
     private String name, deptId;
     private double basic;

     //Static ID counter
     private static int idCounter;

     public Employee(String name, String deptId, double basic) {
         this.id = ++idCounter;
         this.name = name;
         this.deptId = deptId;
         this.basic = basic;
     }

     @Override
     public String toString() {
         return "Emp ID: " + id + "\nName: " + name + "\nDept. ID: " + deptId + "\nBasic: Rs" + basic;
     }

     public abstract double computeNetSalary();

     public double getBasic() {
         return basic;
     }
 }