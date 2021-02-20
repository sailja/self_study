/*
Problem Statement: Sub-class of Employee
*/
package com.app.core;
public class Worker extends Employee {

    private int noOfHours;
    private double rate;

    public Worker(String name, String deptId, double basic, int noOfHours, double rate) {
        super(name, deptId, basic);
        this.noOfHours = noOfHours;
        this.rate = rate;
    }

    @Override
    public String toString() {
         return "Worker Details:\n" + super.toString() + "\nNumber of Hours: " + noOfHours + "\nHourly Rate: " + rate;
    }

    public double computeNetSalary() {
        return super.getBasic() + noOfHours * rate;
    }

    public double getHourlyRate() {
        return rate;
    }

}