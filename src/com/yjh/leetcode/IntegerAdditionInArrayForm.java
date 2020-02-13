package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntegerAdditionInArrayForm {

	public static void main(String[] args) {
		int[] A = { 1, 2, 0, 0 };
		int k = 34;
		List<Integer> addToArrayForm = addToArrayForm(A, k);
		for (Integer integer : addToArrayForm) {
			System.out.println(integer);
		}
	}

	public static List<Integer> addToArrayForm(int[] A, int K) {
		List<Integer> res = new ArrayList<>();
		String str = "";
		for (int i = 0; i < A.length; i++) {
			str += A[i];
		}
		judge(str, String.valueOf(K), "", 0);
		return res;
	}

	public static void judge(String str, String kstr, String resStr, int midVal) {
		
	}
}
