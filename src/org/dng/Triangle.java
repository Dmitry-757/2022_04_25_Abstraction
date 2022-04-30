package org.dng;

/**
 * Сделать наследников с реализацией методов (конструкторы, площадь, периметр, toString).
 * Примеры наследников: треугольник, параллелограмм, трапеция, круг, ромб, прямоугольник, окружность, эллипс
 * (минимум 3 наследника).
 * Реализовать в них методы абстрактных классов.
 */
public class Triangle extends GeomFigure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws Exception {
        if ((a >= (b + c)) || (b >= (a + c)) || (c >= (a + b)) || (a <= 0) || (b <= 0) || (c <= 0))
            throw new Exception("Triangle with such parameters cant exist!");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double getArea() {
        double p = getPerimeter() / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return ((double) Math.round(s * 100)) / 100;
    }

    @Override
    protected double getPerimeter() {
        return ((double) (a + b + c) * 100) / 100;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "} with perimeter " + getPerimeter() + " and Area " + getArea();
    }
}
