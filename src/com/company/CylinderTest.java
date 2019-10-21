package com.company;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cyl = new Cylinder(5,2);
        double vol = cyl.Vol();
        System.out.println("radius = 5 height = 2 volume = " + vol);
        double sa = cyl.SA();
        System.out.println("surface area = " + sa);

        Cylinder cyl2 = new Cylinder(8,6);
        vol = cyl2.Vol();
        System.out.println("radius = 8 height = 6 volume = " + vol);
        sa = cyl2.SA();
        System.out.println("surface area = " + sa);
    }
}


/*
Output:
radius = 5 height = 2 volume = 157.07963267948966
surface area = 219.9114857512855
radius = 8 height = 6 volume = 1206.3715789784806
surface area = 703.7167544041137
 */