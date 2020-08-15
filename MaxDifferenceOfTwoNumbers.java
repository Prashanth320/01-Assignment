package com.pr.ArrAss;

public class MaxDifferenceOfTwoNumbers {

	public static int getMaxDiff(int a[], int total) {
		int difference = a[1] - a[0];
		int i, j;
		for (i = 0; i < total; i++) {
			for (j = i + 1; j < total; j++) {
				if (a[j] - a[i] > difference)
					difference = a[j] - a[i];
			}
		}
		return difference;
	}

	public static void main(String[] args) {
		int a[] = { 2, 5, 1, 7, 3, 9, 5 };
		int b[] = { 9, 2, 12, 5, 4, 7, 3, 19, 5 };
		System.out.println("The Maximum difference between two numbers:" + getMaxDiff(a, 7));
		System.out.println("The Maximum difference between two numbers:" + getMaxDiff(b, 9));
	}
}
