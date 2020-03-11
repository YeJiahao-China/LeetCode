package com.yjh.leetcode;

public class JumpGame {
	static boolean res;

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 1, 4 };
		boolean canJump = canJump3(A);
		System.out.println(canJump);
	}

	/*
	 * public static boolean canJump(int[] A) { if (A.length <= 1) { return
	 * true; } int index = 0; boolean res = false; while (index <= A.length - 1)
	 * { int temp = A[index]; index += temp; if (index == A.length - 1) { res =
	 * true; break; } if (index == 0 && index != A.length - 1) { break; } }
	 * return res; }
	 */

	public static boolean canJump(int[] A) {
		judge(A, 0, 0);
		return res;
	}

	// 时间复杂度过大 未在规定时间内完成
	public static void judge(int[] A, int position, int index) {
		if (index > A.length - 1) {
			return;
		}
		if (A[index] == 0 && index < A.length - 1) {
			return;
		}
		if (position == A.length - 1) {
			res = true;
			return;
		}
		int temp = A[index];
		for (int i = 1; i <= temp; i++) {
			judge(A, position + i, index + i);
		}
	}

	public static boolean canJump2(int[] nums) {
		// 异常输入
		if (nums == null || nums.length < 1)
			return false;
		if (nums.length == 1)
			return true;
		int last = nums.length - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (i + nums[i] >= last)
				last = i;
		}
		return last == 0;
	}

	public static boolean canJumpBySelf(int[] A) {
		if (A == null || A.length < 1) {
			return false;
		}
		if (A.length == 1) {
			return true;
		}
		int curMaxLength = 0;
		for (int i = 0; i < A.length; i++) {
			if (curMaxLength < i) {
				return false;
			}
			curMaxLength = Math.max(curMaxLength, i + A[i]);
		}
		return true;
	}

	public static boolean canJump3(int[] A) {
		if (A == null || A.length == 0) {
			return false;
		}
		int k = 0;
		for (int i = 0; i < A.length; i++) {
			if (k < i) {
				return false;
			}
			k = Math.max(k, i + A[i]);
		}
		return true;
	}

}
