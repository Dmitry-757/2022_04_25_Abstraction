package org.dng;

import java.util.ArrayList;
import java.util.List;

public class ComplexFigure {
    private List<GeomFigure> arr = new ArrayList<>() {
    };

    ComplexFigure(){
    }
    ComplexFigure(GeomFigure figure) {
        try {
            arr.add(figure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addFigure(GeomFigure figure){
        try {
            arr.add(figure);
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
        return ( (double) Math.round(p * 100))/100;
    }

}
