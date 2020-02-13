package com.yjh.leetcode;

public class TheDifferenceBetweenTheSumOfTheProductsOfIntegers {

	public static void main(String[] args) {
		int subtractProductAndSum = subtractProductAndSum(114);
		System.out.println(subtractProductAndSum);
	}

	public static int subtractProductAndSum(int n) {
		char[] arr = String.valueOf(n).toCharArray();
		if (arr.length <= 1) {
			return 0;
		}
		long sum = 0;
		long product = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != '0') {
				product *= (arr[i] - '0');
			} else {
				product = 0;
			}
			sum += (arr[i] - '0');
		}
		return (int) (product - sum);
	}
}
