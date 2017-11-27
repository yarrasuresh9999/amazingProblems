package com.leet.medium;

/*
 * Implement pow(x, n).
 */

public class ImplementPow {
	public double myPow(double x, int n) {
        return Math.pow(x, n);
    }
	
	public static void main(String[] args) {
		ImplementPow impPow = new ImplementPow();
		System.out.println(impPow.myPow(2.0000, 10));
	}
}
