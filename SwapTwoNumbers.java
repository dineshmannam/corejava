package com.dineshmannam;

public class SwapTwoNumbers {
    int x, y, z;
    public void swap(int x, int y){
        z = x;
        x = y;
        y = z;
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        SwapTwoNumbers obj = new SwapTwoNumbers();
        obj.swap(15, 30);
    }
}
