package com.yjh.leetcode;

public class InvertBinaryBit {

	public static void main(String[] args) {

	}

	public static int reverseBits(int n) {
		int res = 0;
		int count = 0;
		while (count < 32) {
			res <<= 1; // res ����һλ�ճ�λ��
			res |= (n & 1); // �õ������λ�ӹ���
			n >>= 1;// ԭ��������һλȥ���Ѿ�����������λ
			count++;
		}
		return res;
	}
}
