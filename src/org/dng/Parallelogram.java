package org.dng;

/**
 * Сделать наследников с реализацией методов (конструкторы, площадь, периметр, toString).
 * Примеры наследников: треугольник, параллелограмм, трапеция, круг, ромб, прямоугольник, окружность, эллипс
 * (минимум 3 наследника).
 * Реализовать в них методы абстрактных классов.
 */
public class Parallelogram extends GeomFigure {
    private double a;
    private double b;
    private int angle;

    public Parallelogram(int a, int b, int angle) throws Exception {
        if ((a <= 0) || (b <= 0) || (angle <= 0) )
            throw new Exception("Parallelogram with such parameters cant exist!");

        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    @Override
    protected double getArea() {
        double c = Math.sin(Math.toRadians(angle < 90 ? angle : 180 - angle));
//        return ((int)(b * a * c * 100))/100;
        return ((double)Math.round(b * a * c * 100)) / 100;
    }

    @Override
    protected double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "a=" + a +
                ", b=" + b +
                ", angle=" + angle +
                "} with perimeter " + getPerimeter() + " and Area " + getArea();
    }
}
