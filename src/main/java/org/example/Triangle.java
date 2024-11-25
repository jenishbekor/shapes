package org.example;

public class Triangle extends Shape{

    private double a,b,c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double S = (a+b+c)/2;
        return Math.sqrt(S * (S-a) * (S-b) * (S-c));
    }
}
