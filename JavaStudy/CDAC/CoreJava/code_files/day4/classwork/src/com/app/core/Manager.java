/*
Problem Statement: Sub-class of Employee
*/
package com.app.core;
public class Manager extends Employee {

    private double perfBonus;

    public Manager(String name, String deptId, double basic, double perfBonus) {
        super(name, deptId, basic);
        this.perfBonus = perfBonus;
    }

    @Override
    public String toString() {
         return "Manager Details:\n" + super.toString() + "\nPerformance Bonus: Rs" + perfBonus;
    }

    public double computeNetSalary() {
        return super.getBasic() + perfBonus;
    }

    public double getPerfBonus() {
        return perfBonus;
    }
}