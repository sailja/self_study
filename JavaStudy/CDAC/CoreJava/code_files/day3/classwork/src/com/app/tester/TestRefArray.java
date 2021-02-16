/**
Problem Statement: Tester Program to learn more about how arrays of reference work.
 */
package com.app.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.app.core.Box;
public class TestRefArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Box[] boxes;
        System.out.print("Enter the number of boxes you want to create:");
        try {
            boxes = new Box[sc.nextInt()];
            for (int i=0; i<boxes.length; i++) {
                System.out.print("Enter the three sides of box no. "+(i+1)+": ");
                boxes[i] = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }

            System.out.println("The data entered in the array are:");
            for (Box b: boxes) {
                System.out.println(b.getDetails());
            }
        } catch(InputMismatchException e) {
            System.out.println("The data entered is not in an appropriate format.");
        }
        sc.close();
    }
}