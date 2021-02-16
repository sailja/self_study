package com.app.core;
public class Box {

    private double length, breadth, height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public String getDetails() {
        return "Length: " + length + "\tBreadth: " + breadth + "\tHeight: " + height;
    }

    public double calcVolume() {
        return length * breadth * height;
    }
}