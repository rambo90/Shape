package com.ukr;

public class Board {

    private Shape[] shapes = new Shape[4];

    public void setShape(Integer i, Shape s) {
        if (shapes[i] != null) {
            System.out.println("in this place " + s.toString());
        } else {
            shapes[i] = s;
        }
    }

    public void delShape(Shape s) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == s) {
                shapes[i] = null;
            } else {
                System.out.println("Клетка не занята");
            }
        }
    }

    public double sumArea() {
        double sum;
        double s = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                System.out.println(shapes[i]);
                sum = shapes[i].getArea();
            } else {
                System.out.println("Клетка " + i + " свободна");
                sum = 0;
            }
            s = s + sum;
        }
        System.out.println("Summary area: " + s);
        return s;
    }
}
