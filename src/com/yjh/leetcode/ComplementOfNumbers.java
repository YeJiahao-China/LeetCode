package com.yjh.leetcode;

public class ComplementOfNumbers {

	public static void main(String[] args) {
		int findComplement = findComplement(5);
		System.out.println(findComplement);
	}

	public static int findComplement(int num) {
		if(num == 0 ){
			return 0;
		}
		String binaryString = Integer.toBinaryString(num);
		String subStr = "";
		int i = 0;
		for (; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1'){
				break;
			}
		}
		subStr = binaryString.substring(i);
		String res = "";
		for (int j = 0; j < subStr.length(); j++) {
			if(subStr.charAt(j)=='0'){
				res+='1';
			}else {
				res+='0';
			}
		}
		return Integer.parseInt(res,2);
	}
}
