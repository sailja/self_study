
/*
Problem Statement: Write a tester class(main based) to test the functionality of the Box class.
*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length, breadth, height;
        System.out.println("Enter the three dimesions of the box:");
        
        try {
            length = sc.nextDouble();
            breadth = sc.nextDouble();
            height = sc.nextDouble();
            Box b = new Box(length, breadth, height);
            b.displayDetails();
            System.out.println("The volume of the box is: " + b.calcVolume());

        }catch(InputMismatchException e) {
            System.out.println("The data entered is not a number and thus cannot be tested.");
            System.exit(0);
        }
        sc.close();
    }
}