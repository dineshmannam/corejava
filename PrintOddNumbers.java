package com.dineshmannam;

public class PrintOddNumbers {
    int n;
    public void formula(int n){
        for(int i=0; i < n; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        PrintOddNumbers obj = new PrintOddNumbers();
        obj.formula(50);
    }
}
