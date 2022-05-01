package org.dng;

public class Rectangle extends GeomFigure implements IPrintable, IDrawable{
    private double a;
    private double b;
    private FigureType figureType;

    public Rectangle(double a, double b) throws Exception {
        if ( (a <= 0) || (b <= 0) )
            throw new Exception("Rectangle with such parameters cant exist!");
        this.a = a;
        this.b = b;
        figureType = FigureType.RECTANGLE;
    }

    @Override
    public void draw() {
        FigureDraw.draw(figureType.getStr());
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("Bla-bla-bla: "+toString());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a = " + a +
                ", b = " + b +
                ", figureType = " + figureType +
                '}';
    }
}
