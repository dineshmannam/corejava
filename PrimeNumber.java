package com.dineshmannam;

public class PrimeNumber<i> {
    int n;
    boolean prime = false;
    public void formula(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = true;
                break;
            }
        }

        if (!prime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.formula(19);
    }

}
