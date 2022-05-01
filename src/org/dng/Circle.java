package org.dng;
/**
 * Сделать наследников с реализацией методов (конструкторы, площадь, периметр, toString).
 * Примеры наследников: треугольник, параллелограмм, трапеция, круг, ромб, прямоугольник, окружность, эллипс
 * (минимум 3 наследника).
 * Реализовать в них методы абстрактных классов.
 */

public class Circle extends GeomFigure {
    private double r;

    public Circle(double r) throws Exception {
        if (r <= 0)
            throw new Exception("Circle with such parameters cant exist!");
        this.r = r;
    }


    @Override
    protected double getArea() {
        return ((double) Math.round(Math.PI * r * r * 100)) / 100;
    }

    @Override
    protected double getPerimeter() {
        return ((double) Math.round(2 * Math.PI * r * 100)) / 100;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                "} with perimeter " + getPerimeter() + " and Area " + getArea();
    }
}
