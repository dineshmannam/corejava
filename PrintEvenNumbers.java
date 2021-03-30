package com.dineshmannam;

public class PrintEvenNumbers {
    int n;
    public void formula(int n){
        for(int i=0; i < n; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        PrintEvenNumbers obj = new PrintEvenNumbers();
        obj.formula(50);
    }
}
