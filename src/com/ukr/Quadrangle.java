package com.ukr;


public class Quadrangle extends Shape {

    private Point a = new Point(2, 5);
    private Point b = new Point(1, 3);
    private Point c = new Point(0, 4);
    private Point d = new Point(1, 6);

    public Quadrangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quadrangle() {
    }

    @Override
    double getPerimeter() {
        return a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a);
    }

    @Override
    double getArea() {
        return a.distance(b) * b.distance(c);
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", d = " + d +
                ", Периметр = " + getPerimeter() +
                ", Площадь = " + getArea() +
                '}';
    }
}