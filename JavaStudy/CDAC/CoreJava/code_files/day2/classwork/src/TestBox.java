
/*
Problem Statement: Write a tester class(main based) to test the functionality of the Box class.
*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class TestBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three dimesions of the box:");
        
        try {
            Box b = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            b.displayDetails();
            System.out.println("The volume of the box is: " + b.calcVolume());

        }catch(InputMismatchException e) {
            System.out.println("The data entered is not a number and thus the wanted information cannot be performed.");
            System.exit(0);
        }
        sc.close();
    }
}