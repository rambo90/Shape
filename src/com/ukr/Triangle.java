package com.ukr;

public class Triangle extends Shape {

    private Point a = new Point(4, 5);
    private Point b = new Point(0, 1);
    private Point c = new Point(6, 4);

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    @Override
    double getPerimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    @Override
    double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a.distance(b)) * (p - b.distance(c)) * (p - c.distance(a)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", Периметр = " + getPerimeter() +
                ", Площадь = " + getArea() +
                '}';
    }
}
