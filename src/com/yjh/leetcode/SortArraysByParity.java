package com.yjh.leetcode;

/*
 * 输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class SortArraysByParity {

	public static void main(String[] args) {
		int[] A = {3,1,2,4};
		int[] sortArrayByParity = sortArrayByParity(A);
		for (int i : sortArrayByParity) {
			System.out.println(i);
		}
	}

	public static int[] sortArrayByParity(int[] A) {
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0 && i != index) {
				int temp = A[i];
				A[i] = A[index];
				A[index] = temp;
				index++;
			}
			if(A[i] % 2 == 0 && i == index){
				index++;
			}
			
		}
		return A;
	}
}
