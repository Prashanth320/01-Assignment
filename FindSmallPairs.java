package com.pr.ArrAss;

public class FindSmallPairs {

	public static void findSmallPair(int a[], int sum) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println("The Small pair at index:" + i + "and:" + j);
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]={1, 7, 2, 9, 6};
		int sum=3;
		findSmallPair(a, sum);
		
	}
}
