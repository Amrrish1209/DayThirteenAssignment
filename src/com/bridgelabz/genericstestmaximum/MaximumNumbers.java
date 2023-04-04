package com.bridgelabz.genericstestmaximum;

public class MaximumNumbers {

	public void floatMax(double d, double e, double f) {
		Double max = d;
		if (Double.compare(e, max) > 0.0) {
			max = e;
		}
		if (Double.compare(f, max) > 0.0) {
			max = f;
		}
		System.out.println(max);
	}

	public void intMax(int a, int b, int c) {

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

		MaximumNumbers maximumNumbers = new MaximumNumbers();
		maximumNumbers.intMax(20, 30, 10);
		maximumNumbers.floatMax(2.5, 1.0, 5.0);
	}
}
