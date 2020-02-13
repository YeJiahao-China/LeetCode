package com.yjh.leetcode;

//  ÊäÈë£ºarr = [1,2,2,6,6,6,6,7,10]
//Êä³ö£º6
public class Elementswithmorethan25OccurrencesInAnOrderedArray {

	public static void main(String[] args) {
		int[] arr = {1,1};
		int findSpecialInteger = findSpecialInteger(arr);
		System.out.println(findSpecialInteger);
	}

	public static int findSpecialInteger(int[] arr) {
		int count = 1;
		int judge = arr.length/4;
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i<arr.length-1){
				if(arr[i]==arr[i+1]){
					count++;
					continue;
				}else {
					if(count>judge){
						res = arr[i];
						break;
					}
					count = 1;
				}
			}else {
				res = arr[i];
			}
		}
		return res;
	}
}
