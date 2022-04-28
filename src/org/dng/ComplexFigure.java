package org.dng;

import java.util.ArrayList;
import java.util.List;

public class ComplexFigure {
    private List<GeomFigure> arr = new ArrayList<>() {
    };

    ComplexFigure() {
        try {
            Triangle triangle = new Triangle(2, 3, 4);
            Circle circle = new Circle(1);
            Parallelogram parallelogram = new Parallelogram(2, 4, 30);

            arr.add(triangle);
            arr.add(circle);
            arr.add(parallelogram);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getCombinedArea() {
        double s = 0;
        for (GeomFigure f : arr) {
            s += f.getArea();
        }
        return s;
    }

    public double getCombinedPerimeter() {
        double p = 0;
        for (GeomFigure f : arr) {
            p += f.getPerimeter();
        }
        return p;
    }

}
