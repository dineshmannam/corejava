package com.dineshmannam;
import java.util.Arrays;

public class ArrayAddition {

    public static void main(String[] args) {
	 int[] a = {1, 2, 3};
	 int[] b = {5, 9, 7};
	 int[] c = add(a, b);
	 System.out.println(Arrays.toString(c));
    }

	public static int[] add(int[] a, int[] b) {
    	int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}
}
