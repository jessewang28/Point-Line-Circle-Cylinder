package com.company;

public class Circle {
    private double r;
    private Circle c1;

    public Circle()
    {
        r = 1;
    }

    public Circle(double radius)
    {
        r = radius;
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
