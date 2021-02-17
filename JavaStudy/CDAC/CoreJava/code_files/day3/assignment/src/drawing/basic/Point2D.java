/*
Problem Statement: Write a core class to perform actions on Point2D
*/
package drawing.basic;
import java.lang.Math;
public class Point2D {

    private double x, y;
    
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String show() {
        return "x: " + x + "\ty: " + y;
    }

    public boolean isEqual(Point2D p) {
        return x == p.x && y == p.y;
    }

    public Point2D createNewPoint(double xOffSet, double yOffSet) {
        return new Point2D(x+xOffSet, y+yOffSet);
    }

    public double calculateDistance(Point2D p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
}