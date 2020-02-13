package com.yjh.leetcode;

public class ZeroAfterFactorial {

	public static void main(String[] args) {
		/*int trailingZeroes = trailingZeroes(7);
		System.out.println(trailingZeroes);*/
	}

	/*public static int trailingZeroes(int n) {
		if (n <= 0) {
			return 0;
		}
		String temp = "";
		long factorial = factorial(n);
		System.out.println(factorial);
		String valueOf = String.valueOf(factorial);
		char[] charArray = valueOf.toCharArray();
		int res = 0;
		for (int i = charArray.length - 1; i >= 0; i--) {
			if (charArray[i] == '0') {
				res++;
			}else {
				break;
			}
		}
		return res;
	}

	public static long factorial(int n) {
		if (n == 1) {
			return n;
		}
		return n * factorial(n - 1,temp);
	}*/
}
