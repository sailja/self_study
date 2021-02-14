/*
Problem Statement: Write a tightly encapsulated class to perform actions on a Box.
*/
public class Box {

    private double length, breadth, height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void displayDetails() {
        System.out.println("The details are:\nLength: " + length + "\nBreadth: " + breadth + "\nHeight: " + height);
    }

    public double calcVolume() {
        return length * breadth * height;
    }
}