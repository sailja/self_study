/**
Problem Statement: Tester program to learn more about the inheritence.
 */
 package com.app.tester;
 import java.util.Scanner;
 import java.util.InputMismatchException;
 import com.app.core.Student;
 public class TestInh {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and the graduation year of the Student: ");
        try {
            Student s = new Student(sc.next(), sc.next(), sc.nextInt());
            System.out.println(s);
        } catch(InputMismatchException e) {
            System.out.println("The data entered is not in a valid format.");
        }
        sc.close();
     }
 }