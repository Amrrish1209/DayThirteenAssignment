package com.bridgelabz.genericstestmaximum;

public class MaximumNumbers {

	public static void sMax(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println(max);
	}

	public static void fMax(double d, double e, double f) {
		Double max = d;
		if (Double.compare(e, max) > 0.0) {
			max = e;
		}
		if (Double.compare(f, max) > 0.0) {
			max = f;
		}
		System.out.println(max);
	}

	public static void iMax(int a, int b, int c) {

		int max = a;

		if (Integer.compare(b, max) > 0) {
			max = b;
		}
		if (Integer.compare(c, max) > 0) {
			max = c;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		iMax(20, 30, 10);
		fMax(2.5, 1.0, 5.0);
		sMax("apple", "banana", "orange");
	}
}
