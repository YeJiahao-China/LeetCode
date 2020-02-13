package com.yjh.leetcode;

/*如果数组是单调递增或单调递减的，那么它是单调的。

如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。

当给定的数组 A 是单调数组时返回 true，否则返回 false。
示例 1：

输入：[1,2,2,3]
输出：true
*/
public class MonotoneSequence {
	static boolean res ;
	public static void main(String[] args) {
		int[] A = { 2, 2, 2, 1, 4, 5 };
		boolean monotonic = isMonotonic(A);
		System.out.println(monotonic);
	}

	public static boolean isMonotonic(int[] A) {
		if (A.length == 0 || A.length == 1 || A.length == 2) {
			return true;
		}
		int flag = 0;
		if (A[0] > A[1]) {
			flag = -1;
		}
		if (A[0] < A[1]) {
			flag = 1;
		}
		judge(A, 1, 2, flag);
		return res;
	}

	public static void judge(int[] A, int i, int j, int flag) {
		if (i >= A.length - 1) {
			res = true;
			return;
		}
		int temp = 0;
		if (A[i] > A[j]) {
			temp = -1;
		}
		if (A[i] < A[j]) {
			temp = 1;
		}
		if (flag == 0) {
			flag = temp;
			i++;
			j++;
			judge(A, i, j, flag);
		}else {
			if (temp != flag && temp != 0) {
				res = false;
				return;
			} else {
				i++;
				j++;
				judge(A, i, j, flag);
			}
		}
	}

}
