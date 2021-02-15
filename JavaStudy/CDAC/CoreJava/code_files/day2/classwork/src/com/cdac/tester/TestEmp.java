package com.cdac.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.cdac.core.Employee;

public class TestEmp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID, Name & Salary of the Employee:");
        try {
            Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
            System.out.println("The details of the Employee are:\n" + emp.getDetails());
        } catch(InputMismatchException e) {
            System.out.println("The data entered is not of valid format. Please give valid inputs next time.");
        }
        sc.close();
    }
}