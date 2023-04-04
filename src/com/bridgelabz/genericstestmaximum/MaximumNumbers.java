package com.bridgelabz.genericstestmaximum;

public class MaximumNumbers {

	private int a;
	private int b;
	private int c;

	public void max(int a, int b, int c) {

		int max = a;

		if (Integer.compare(b, max)>0) {
			max = b;
		}
		if (Integer.compare(c, max)>0) {
			max = c;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		MaximumNumbers maximumNumbers = new MaximumNumbers();
		maximumNumbers.max(20, 30, 10);
	}
}
