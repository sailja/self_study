/*
Problem Statement: Write a tester to test and perform operations on Point2D
*/
package drawing.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
import drawing.basic.Point2D;
public class TestPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            // Taking an array as an input
            System.out.println("Enter the number of points to create:");
            Point2D[] points = new Point2D[sc.nextInt()];
            
            for(int i=0; i<points.length; i++) {
                System.out.println("Enter the co-ordinates for the point " + (i + 1) + ":");
                points[i] = new Point2D(sc.nextDouble(), sc.nextDouble());
            }

            // Displaying the details of the points array
            System.out.println("The details of the points are:");
            for(Point2D p: points) {
                System.out.println(p.show());
            }

            // Taking two points as inputs
            System.out.println("Enter two points:");
            Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());
            Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());
            
            // Checking if they are same points
            if (p1.isEqual(p2)) {
                System.out.println("The points: " + p1.show() + " and " + p2.show() + " are the same point");
            } else {
                System.out.println("The points: " + p1.show() + " and " + p2.show() + " are not the same point");
            }

            // Calculate the distance between the two points
            System.out.println("The Distance between the above two points are: " + p1.calculateDistance(p2));

        } catch(InputMismatchException e) {
            System.out.println("The data entered is not in the correct format.");
        }
        sc.close();
    }
}