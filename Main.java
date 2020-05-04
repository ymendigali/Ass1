package com.company;

public class Main {
    
    public static void main(String[] args) {
        Shape pentagon = new Shape();
        Point p1 = new Point(-5, 5);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(7, -2);
        Point p4 = new Point(1, -4);
        Point p5 = new Point(-7, 0);
        pentagon.addPoint(p1);
        pentagon.addPoint(p2);
        pentagon.addPoint(p3);
        pentagon.addPoint(p4);
        pentagon.addPoint(p5);
        System.out.println("Distance between two points is " + p1.distance(p2));
        System.out.println("Perimeter of the shape is " + pentagon.getCalculatePerimeter());
        System.out.println("The longest side is " + pentagon.getLongestSide());
        System.out.println("The average side is " + pentagon.getAverageSide());
        System.out.println("The next is all points");
        pentagon.getPoints();
        System.out.println("Now, the program is reading from points.txt");
        AssignmentOne.read();
    }
}
