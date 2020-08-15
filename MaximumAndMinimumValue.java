package com.pr.ArrAss;

public class MaximumAndMinimumValue {

	public static int getMaxmiumuValue(int a[]) {

		int maximumValue = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > maximumValue) {
				maximumValue = a[i];
			}
		}

		return maximumValue;
	}

	public static int getMinimumValue(int a[]) {

		int minimumValue = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < minimumValue) {
				minimumValue = a[i];
			}
		}

		return minimumValue;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 5, 6, 6, 7, 2 };
		System.out.println("Maximum value of Array is:" + getMaxmiumuValue(a));
		System.out.println("Minimum value of Array is:" + getMinimumValue(a));
	}
}
