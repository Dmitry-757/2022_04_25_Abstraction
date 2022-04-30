package org.dng;

import java.util.ArrayList;
import java.util.List;

public class TestComplexFigure {
    /**
     * for the purpose of testing, we will create single object of Circle and use it as the argument of constructor for
     * instance of ComplexFigure-class.
     * next, we will create list of GeomFigure-child and use it in call of method addFigure()
     * so, we have instance of ComplexFigure-class containing triangle, circle and parallelogram objects.
     * Now, lets call methods for calculating summary of perimeters of it all,
     * and methods for calculating summary of areas of this objects
     */

    public static void main(String[] args) {
        List<GeomFigure> gfList = null;
        GeomFigure circle = null;
        try {
            circle = new Circle(3.14);
            gfList = createSomeFigures();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ComplexFigure cf = new ComplexFigure(circle);
        if (gfList != null) {
            for (GeomFigure gf:gfList) {
                cf.addFigure(gf);
            }
        }
        System.out.println("Combined area of all figures are "+cf.getCombinedArea());
        System.out.println("Combined perimeter of all figures are "+cf.getCombinedPerimeter());

    }


    public static List<GeomFigure> createSomeFigures() throws Exception {
        List<GeomFigure> gfList = new ArrayList<>();
        gfList.add(new Triangle(3, 4, 3));
        gfList.add(new Parallelogram(3, 4, 30));
//        gfList.add(new Circle(3.14));

        return gfList;
    }
}
