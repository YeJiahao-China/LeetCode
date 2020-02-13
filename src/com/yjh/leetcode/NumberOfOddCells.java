package com.yjh.leetcode;


/*
 * 输入：n = 2, m = 3, indices = [[0,1],[1,1]]
输出：6
解释：最开始的矩阵是 [[0,0,0],[0,0,0]]。
第一次增量操作后得到 [[1,2,1],[0,1,0]]。
最后的矩阵是 [[1,3,1],[1,3,1]]，里面有 6 个奇数。
 */
public class NumberOfOddCells {

	public static void main(String[] args) {
		int n = 2,m = 2;
		int[][] indices = {{1,1},{0,0}};
		int oddCells = oddCells(n,m,indices);
		System.out.println(oddCells);
	}

	public static int oddCells(int n, int m, int[][] indices) {
		int count = 0;
		int[][] origin = new int[n][m];
		for (int i = 0; i < indices.length; i++) {
			int row = indices[i][0];
			int column = indices[i][1];
			for (int j = 0; j < origin[row].length; j++) {
				origin[row][j]++;
			}
			for (int j = 0; j < origin.length; j++) {
				origin[j][column]++;
			}
		}
		for (int i = 0; i < origin.length; i++) {
			for (int j = 0; j < origin[i].length; j++) {
				if(origin[i][j]%2!=0){
					count++;
				}
			}
		}
		return count;
	}
}
