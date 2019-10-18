package com.company;

public class Cylinder {
    private Circle c1;
    private double h;

    public Cylinder(int r,double h)
    {
        c1 = new Circle(r);
        double height = h;
    }

    public Cylinder()
    {
        c1 = new Circle();
        double h = 1;
    }
}
