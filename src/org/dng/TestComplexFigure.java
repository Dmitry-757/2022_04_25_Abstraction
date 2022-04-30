package org.dng;

public class TestComplexFigure {
    /**
     * for the purpose of testing, we will create single object of Circle and use it as the argument of constructor for
     * instance of ComplexFigure-class.
     * For creating objects and catching related exceptions we will use factory method in special class FigureFactory.
     * next, we will create a pair of GeomFigure-child and use it in call of method addFigure()
     * so, we have an instance of ComplexFigure-class containing triangle, circle and parallelogram objects.
     * Now, lets call methods for calculating summary of perimeters of it all,
     * and methods for calculating summary of areas of this objects
     */

    public static void main(String[] args) {
        GeomFigure circle = FigureFactory.createFigure(FigureTypes.CIRCLE, 1);
        GeomFigure triangle = FigureFactory.createFigure(FigureTypes.TRIANGLE, 3,4,3);
        GeomFigure parallelogram = FigureFactory.createFigure(FigureTypes.PARALLELOGRAM, 4, 4, 30);

        ComplexFigure cf = new ComplexFigure(circle);
        cf.addFigure(triangle);
        cf.addFigure(parallelogram);

        System.out.println("Combined area of all figures are "+cf.getCombinedArea());
        System.out.println("Combined perimeter of all figures are "+cf.getCombinedPerimeter());

    }


}
