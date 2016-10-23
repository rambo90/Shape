package com.ukr;


public class Main {
    public static void main(String[] args) {

        Shape quad = new Quadrangle();
        Shape tri = new Triangle();
        Shape cir = new Circle();

        Board b = new Board();
        b.setShape(0, cir);
        b.setShape(1, tri);
        b.setShape(3, quad);
        b.sumArea();
    }
}
