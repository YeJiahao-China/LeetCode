package com.yjh.leetcode;

/*
 * ���룺[3,1,2,4]
�����[2,4,3,1]
��� [4,2,3,1]��[2,4,1,3] �� [4,2,1,3] Ҳ�ᱻ���ܡ�
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
