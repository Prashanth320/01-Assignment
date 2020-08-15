package com.pr.ArrAss;

import java.util.Arrays;

public class SumOfUniqNumbers {

	public static int findSumOfNumbers(int a[], int n) {
		// sort all elements of array

		Arrays.sort(a);

		int sum = a[0];
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				sum = sum + a[i + 1];
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int a[] = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };
		int b[] = { 1, 1, 3, 2, 2, 3 };
		int n = a.length;
		int n1 = b.length;
		System.out.println("Sum of Uniq elements in Array =" + findSumOfNumbers(a, n));
		System.out.println("Sum of Uniq elements in Array =" + findSumOfNumbers(b, n1));

	}
}
