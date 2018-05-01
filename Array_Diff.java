package com.array_difference;

public class Array_Diff {

	static int[] arr= {56,72,94,23,11,35,9};
	public static int getmin(int[] arr) {
		int minVal = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minVal) {
				minVal = arr[i];
			}
		}
		return minVal;
	}

	public static int getmax(int[] arr) {
		int maxVal = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}

	public static void main(String[] args) {
		
		System.out.println("Difference between the minimum element and maximum element in the array is "
				+ (getmax(arr) - getmin(arr)));

	}
}
