package com.app.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TestPrimArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] arr;
        System.out.print("Enter the number of elements you want the length of array to be:");
        try {
            arr = new double[sc.nextInt()];
            for (int i=0; i<arr.length; i++) {
                System.out.print("Enter the element no. "+i+" of the array:");
                arr[i] = sc.nextDouble();
            }

            System.out.println("The data entered in the array are:");
            for (double d: arr) {
                System.out.print(d + "\t");
            }
        } catch(InputMismatchException e) {
            System.out.println("The data entered is not in an appropriate format.");
        }
        sc.close();
    }
}