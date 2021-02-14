/**
 * Problem statement: Take a number as an input using scanner and test whether even or not.
 */
import java.util.Scanner;
public class TestEven {
    public static void main(String[] args) {

        // Instantiating the Scanner class, since the methods we'll use are non-static methods
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number to test even or not:");

        // sc.hasNextInt(): Test if the data input in the buffer Integer or not
        if(sc.hasNextInt()) {

            //sc.nextInt(): Read the data input in the buffer as an integer
            num = sc.nextInt();

            if(num % 2 == 0) {
                System.out.println("The number input is even.");
            } else {
                System.out.println("The number input is odd.");
            }
        } else {
            System.out.println("The data entered is not a number and hence is not parsable.");
        }

        // Need to close the handler to the Scanner Buffer.
        sc.close();
    }
}
