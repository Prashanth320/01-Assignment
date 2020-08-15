package com.pr.ArrAss;

public class FindSumpaires {

	public static void findPairs(int a[], int n) {
		System.out.println("Pairs of elements whose sum is " + n + " are : ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == n) {
					System.out.println(a[i] + " + " + a[j] + " = " + n);
				}
			}
		}
	}

	public static void main(String[] args) {
		findPairs(new int[] { 3, 6, 8, -8, 10, 8 }, 16);

	}

}
