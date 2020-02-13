package com.yjh.leetcode;

import java.util.Arrays;

/*
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
输出: [[1,0,0],[0,1,0],[1,1,1]]
解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
     然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]

 */
public class FlippedPicture {

	public static void main(String[] args) {
		int A[][]= {{1,1,0},{1,0,1},{0,0,0}};
		int[][] flipAndInvertImage = flipAndInvertImage(A);
		for (int[] is : flipAndInvertImage) {
			System.out.println(Arrays.toString(is));
		}
	}

	public static int[][] flipAndInvertImage(int[][] A) {

		for (int i = 0; i < A.length; i++) {
			// 先进行翻转操作
			for (int j = 0; j < A[i].length / 2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][A[i].length - j - 1];
				A[i][A[i].length - j - 1] = temp;
			}
			// 进行反转操作
			for (int j = 0; j < A[i].length; j++) {
				if (A[i][j] == 1) {
					A[i][j] = 0;
				} else {
					A[i][j] = 1;
				}
			}
		}
		return A;
	}
}
