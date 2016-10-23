package com.ukr;

public class Circle extends Shape {
    private Point a = new Point(0, 0);
    private Point b = new Point(0, 6);

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Circle() {
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * a.distance(b);
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(a.distance(b), 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a = " + a +
                ", b = " + b +
                ", Периметр = " + getPerimeter() +
                ", Площадь = " + getArea() +
                '}';
    }
}
