package org.dng;

public class Triangle  extends GeomFigure implements IDrawable, IPrintable{
    private double a;
    private double b;
    private double c;
    private FigureType figureType;

    public Triangle(double a, double b, double c) throws Exception {
        if ((a >= (b + c)) || (b >= (a + c)) || (c >= (a + b)) || (a <= 0) || (b <= 0) || (c <= 0))
            throw new Exception("Triangle with such parameters cant exist!");

        this.a = a;
        this.b = b;
        this.c = c;
        figureType = FigureType.TRIANGLE;
    }

    @Override
    public void draw() {
        FigureDraw.draw(figureType.getStr());
        System.out.println();
    }

    @Override
    public void print() {
//        System.out.println(toString());
        System.out.println("Bla-bla-bla: "+toString());
    }

    @Override
    public String toStringShort() {
        return figureType.toString();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", figureType = " + figureType +
                '}';
    }

}
