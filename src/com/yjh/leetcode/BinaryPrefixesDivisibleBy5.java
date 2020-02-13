package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixesDivisibleBy5 {

	public static void main(String[] args) {
		int[] A  = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
		List<Boolean> prefixesDivBy5 = prefixesDivBy5(A);
		for (Boolean b : prefixesDivBy5) {
			System.out.println(b);
		}
	}

	public static List<Boolean> prefixesDivBy5(int[] A) {
		ArrayList<Boolean> res = new ArrayList<Boolean>();
		int end = 0;
		while (end<A.length) {
			String temp = "";
			for (int i = 0; i <= end; i++) {
				temp+=A[i];
			}
			end++;
			if(Long.parseLong(temp, 2)%5==0){
				res.add(true);
			}else {
				res.add(false);
			}
		}
		return res;
	}
}
