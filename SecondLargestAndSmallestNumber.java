package com.pr.ArrAss;

public class SecondLargestAndSmallestNumber {

	public static int getSecondLargeNumber(int a[], int total) {
		int second;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					second = a[i];
					a[i] = a[j];
					a[j] = second;
				}
			}
		}
		return a[total - 3];
	}

	public static int getSecondSmallNumber(int a[], int total) {
		int second;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					second = a[i];
					a[i] = a[j];
					a[j] = second;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 9, 6, 4, 7, 2 };
		System.out.println("Second Largest Number of Array:" + getSecondLargeNumber(a, 8));
		System.out.println("Second Smallest Number of Array:" + getSecondSmallNumber(a, 8));
	}
}
