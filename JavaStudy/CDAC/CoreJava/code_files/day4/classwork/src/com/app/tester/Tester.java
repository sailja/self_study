/*
Problem Statement: Tester program to build the organization structure.
*/
package com.app.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.app.core.*;
public class Tester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        try {
            System.out.println("Enter the Organization size:");
            Employee[] emp = new Employee[sc.nextInt()];
            int counter = 0;
            while(!exit) {
                System.out.println("What do you want to do:\n1. Hire a manager.\n2. Hire a Worker.\n0. Exit");
                switch(sc.nextInt()) {
                    case 1:
                        System.out.println("Enter the name, department id, basic pay and performance bonus:");
                        emp[counter++] = new Manager(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
                        break;

                    case 2:
                        System.out.println("Enter the name, department id, basic pay, no of hours and hourly rate:");
                        emp[counter++] = new Worker(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());
                        break;

                    case 0:
                        exit = true;
                        break;

                    default:
                        System.out.println("The option given is not in the list.\nPlease choose a valid option.");
                }
                if (counter == emp.length) {
                    System.out.println("The length of the array is full.");
                    exit = true;
                }
            }

            System.out.println("\n\nThe details of the employees:");
            System.out.println("----------------------------------");
            for (Employee e : emp) {
                System.out.println(e);
                System.out.println("----------------------------------");
                // If manager show the performance bonus. 
                // If worker show hourly rate
                if (e instanceof Manager) {
                    System.out.println("Performance bonus: Rs" + ((Manager)e).getPerfBonus());
                } else {
                    System.out.println("Hourly rate: Rs" + ((Worker)e).getHourlyRate());
                }
                System.out.println("----------------------------------");
            }
        } catch (InputMismatchException e) {
            System.out.println("The data entered is not in a current format.");
        } finally {
            sc.close();
        }
    }
}