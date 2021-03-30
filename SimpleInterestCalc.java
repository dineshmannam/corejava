package com.dineshmannam;

//          A = P (1 + rt)
//        A	=	final amount
//        P	=	initial principal balance
//        r	=	annual interest rate
//        t	=	time (in years)


public class SimpleInterestCalc {
    double p;
    double r;
    int t;
    double a;
    public void formula(double p, double r, int t){
        a = p*(1 + ((r/100)*t));
        System.out.println(a);
    }

    public static void main(String[] args) {
        SimpleInterestCalc obj = new SimpleInterestCalc();
        obj.formula(1000, 2.49, 2);
    }

}
