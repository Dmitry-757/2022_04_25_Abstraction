package org.dng;

public class Main {

    public static void main(String[] args) {
        try {
            Parallelogram parallelogram = new Parallelogram(2, 4, 30);
            System.out.println("Perimeter = "+parallelogram.getPerimeter());
            System.out.println("Area = "+parallelogram.getArea());
            System.out.println(parallelogram.toString());
            System.out.println();

            Triangle triangle = new Triangle(4,2,3);
            System.out.println("Perimeter = "+triangle.getPerimeter());
            System.out.println("Area = "+triangle.getArea());
            System.out.println(triangle.toString());
            System.out.println();

            Circle circle = new Circle(1);
            System.out.println("Perimeter = "+circle.getPerimeter());
            System.out.println("Area = "+circle.getArea());
            System.out.println(circle.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
