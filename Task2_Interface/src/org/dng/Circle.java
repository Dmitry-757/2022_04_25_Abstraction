package org.dng;

public class Circle extends GeomFigure{
    private double r;
    private FigureType figureType;


    public Circle(double r) throws Exception {
        if (r <= 0)
            throw new Exception("Circle with such parameters cant exist!");
        this.r = r;
        figureType = FigureType.CIRCLE;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + r +
                ", figureType = " + figureType +
                '}';
    }
}
