package com.bridgelabz.genericstestmaximum;

public class MaximumNumbers<M extends Comparable<M>> {

	private M a;
	private M b;
	private M c;
	private M max;

	public MaximumNumbers(M a, M b, M c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.max = a;
	}

	public M max() {

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMax(a, b, c, max);
		return max;
	}

	public static <M> void printMax(M a, M b, M c, M max) {
		System.out.println("a value is: " + a + ", b value is: " + b + ", c value is: " + c + ", max of three value is: " + max);
	}

	public static void main(String[] args) {

		MaximumNumbers<Integer> intMax = new MaximumNumbers<Integer>(50, 10, 30);
		MaximumNumbers<Double> doubleMax = new MaximumNumbers<Double>(3.5, 1.5, 1.0);
		MaximumNumbers<String> stringMax = new MaximumNumbers<String>("apple", "orange", "grape");

		System.out.println(intMax.max());
		System.out.println(doubleMax.max());
		System.out.println(stringMax.max());
	}
}
