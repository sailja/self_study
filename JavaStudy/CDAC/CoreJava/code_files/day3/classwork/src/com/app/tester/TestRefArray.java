package com.app.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.app.core.Box;
public class TestRefArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Box[] arr;
        System.out.print("Enter the number of elements you want the length of array to be:");
        try {
            arr = new Box[sc.nextInt()];
            for (int i=0; i<arr.length; i++) {
                System.out.print("Enter the three sides of the box no. "+i+": ");
                arr[i] = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }

            System.out.println("The data entered in the array are:");
            for (Box b: arr) {
                System.out.println(b.getDetails());
            }
        } catch(InputMismatchException e) {
            System.out.println("The data entered is not in an appropriate format.");
        }
        sc.close();
    }
}