/*
Problem Statement: Write a tightly encapsulated class to perform actions on a Box.
*/
public class Box {

    double length, breadth, height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void displayDetails() {
        System.out.println("The details are:\nLength: " + this.length + "\nBreadth: " + this.breadth + "\nHeight: " + this.height);
    }

    public double calcVolume() {
        return this.length * this.breadth * this.height;
    }
}