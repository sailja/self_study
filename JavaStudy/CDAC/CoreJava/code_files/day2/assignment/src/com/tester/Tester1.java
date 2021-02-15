package com.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.app.core.Student;
class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name, Email, Age and three scores of the Student:");
        try {
            Student s1 = new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println("The details of the Student are:\n" + s1.fetchDetails());
        } catch(InputMismatchException e) {
            System.out.println("The data input is not of the correct format. Please run the program again, and this time, please do add appropriate correct information");
        }
        sc.close();
    }
}