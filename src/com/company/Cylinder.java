package com.company;

public class Cylinder {
    private Circle c1;
    private double h;

    public Cylinder(double r,double height)
    {
        c1 = new Circle(r);
        h = height;
    }


    public double Vol()
    {
        double v = c1.Area() * h;
        return v;
    }

    public double SA()
    {
        double SA = (2*c1.Area()+c1.Circumference()*h);
        return SA;
    }

}
