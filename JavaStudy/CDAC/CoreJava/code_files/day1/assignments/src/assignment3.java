/**
 * Problem Statement: Take two numbers as input using Scanner and display the average
 */
import java.util.Scanner;
class Average2 {
    public static void main(String[] args) {
        
        double num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find the average:");
        if(sc.hasNextDouble())
            num1 = sc.nextDouble();
        else if(sc.hasNextDouble())
            num2 = sc.nextDouble();
        else {
            System.out.println("The data entered is not a valid number. \nExiting the execution of the program.");
            System.exit(0);
        }

        System.out.println("The average is: " + (num1 + num2)/2 );
        
        sc.close();
    }    
}
