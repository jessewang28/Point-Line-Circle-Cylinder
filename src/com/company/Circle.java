package com.company;

public class Circle {
    private double r;
    public Circle c1;

    public Circle(double r)
    {
        c1 = new Circle(r);
    }

    public Circle()     //default constructor
    {
        c1 = new Circle();
    }

    public double Area()
    {
        double a = Math.PI*Math.pow(r, 2);
        return a;
    }

    public double Circumference()
    {
        double c = 2*r*Math.PI;
        return c;
    }
}
