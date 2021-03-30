package com.dineshmannam;

public class AdditionofTwoNumbers {
    int x, y, z;
    public void adding(int x, int y){
        z = x + y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        AdditionofTwoNumbers obj = new AdditionofTwoNumbers();
        obj.adding(20, 30);
    }
}
