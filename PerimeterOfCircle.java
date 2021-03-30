package com.dineshmannam;

public class PerimeterOfCircle {
    double r;
    double p = 3.14;
    double c;

    public void prcirc(double r, double p){
        c = 2*p*r;
        System.out.println(c);
    }

    public static void main(String[] args) {
        PerimeterOfCircle obj = new PerimeterOfCircle();
        obj.prcirc(13.5, obj.p);
    }
}
