package com.dineshmannam;

public class AreaOfCircle {
    double r;
    double p = 3.14;
    public void Area(double r, double p){
        double c = p * (r * r);
        System.out.println(c);
    }

    public static void main(String[] args) {
        AreaOfCircle obj = new AreaOfCircle();
        obj.Area(7, obj.p);
    }
}
