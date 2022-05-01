package org.dng;

import java.util.ArrayList;
import java.util.List;

public class ComplexFigure {
    private List<GeomFigure> figureList = new ArrayList<>() {
    };

    ComplexFigure(){
    }
    ComplexFigure(GeomFigure figure) {
        try {
            figureList.add(figure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addFigure(GeomFigure figure){
        try {
            figureList.add(figure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getCombinedArea() {
        double s = 0;
        for (GeomFigure f : figureList) {
            s += f.getArea();
        }
        return s;
    }

    public double getCombinedPerimeter() {
        double p = 0;
        for (GeomFigure f : figureList) {
            p += f.getPerimeter();
        }
        return ( (double) Math.round(p * 100))/100;
    }

}
