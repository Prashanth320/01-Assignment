package com.pr.ArrAss;

public class ThirdLargestNumber {

	public static int getThirdLargeNumber(int a[], int total) {
		int third;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					third = a[i];
					a[i] = a[j];
					a[j] = third;
				}
			}
		}
		return a[total - 3];
	}

	public static void main(String[] args) {
		int a[] = { 6, 8, 1, 9, 2, 1, 10 };
		int b[] = { 6, 8, 1, 9, 2, 1, 10, 12 };
		System.out.println("Third Largest Number:"+getThirdLargeNumber(a, 7));
		System.out.println("Third Largest Number:"+getThirdLargeNumber(b, 8));
	}
}
