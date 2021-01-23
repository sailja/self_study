/*
Problem Statement: Accept 2 numbers from user using scanner. Compare 2 numbers & print comparison results. 
 */
import java.util.Scanner;
class Comparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.println("Enter two numbers to compare them:");
		
		// Taking the first number as input
		if (sc.hasNextInt())
			num1 = sc.nextInt();
		else {
			System.out.println("The data entered is not an integer number");
			System.exit(0);
		}
		
		// Taking the first number as input
		if (sc.hasNextInt())
			num2 = sc.nextInt();
		else {
			System.out.println("The data entered is not an integer number");
			System.exit(0);	
		}
			
		// Comparing the two numbers
		if (num1 > num2)
			System.out.println(num1 + " is greater than " + num2);
		else if (num2 > num1)
			System.out.println(num2 + " is greater than " + num1);
		else
			System.out.println(num1 + " is equal to " + num2); 
		
		sc.close();
	}
}
