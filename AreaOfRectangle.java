package com.dineshmannam;

public class AreaOfRectangle {
    double l;
    double b;

    public void formula (double l, double b){
        double a = l * b;
        System.out.println(a);
    }

    public static void main(String[] args) {
        AreaOfRectangle obj = new AreaOfRectangle();
        obj.formula(35, 15);
    }
}
