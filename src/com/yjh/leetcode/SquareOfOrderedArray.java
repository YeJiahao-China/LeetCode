package com.yjh.leetcode;

public class SquareOfOrderedArray {

	public static void main(String[] args) {
		int[] A = {-4,-1,0,3,10};
		int[] sortedSquares = sortedSquares(A);
		for (int i : sortedSquares) {
			System.out.println(i);
		}
	}

	public static int[] sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = Math.abs(A[i]);
		}
		insertSort(A);
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i]*A[i];
		}
		return A;
	}
	//使用插入排序对数字进行排序
	public static void insertSort(int[] A){
		for (int i = 1; i < A.length; i++) {
			int insertVal = A[i];
			int insertIndex = i-1;
			while (insertIndex>=0 && insertVal<A[insertIndex]) {
				A[insertIndex+1] = A[insertIndex];
				insertIndex--;
			}
			A[insertIndex+1] = insertVal;
		}
	}
}
