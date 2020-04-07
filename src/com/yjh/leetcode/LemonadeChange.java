package com.yjh.leetcode;

public class LemonadeChange {

	public static void main(String[] args) {
		int[] bills = {5,5,10,10,20};
		boolean lemonadeChange = lemonadeChange(bills);
		System.out.println(lemonadeChange);
	}

	public static boolean lemonadeChange(int[] bills) {
		int[] arr = new int[2];
		for (int i = 0; i < bills.length; i++) {
			if (arr[0] <= 0 && bills[i] >= 10) {
				return false;
			}
			if (bills[i] == 10) {
				arr[0]--;
				arr[1]++;
			}
			if (bills[i] == 5) {
				arr[0]++;
			}
			if (bills[i] == 20) {
				if (arr[1] > 0 && arr[0] > 0) {
					arr[0]--;
					arr[1]--;
				} else if (arr[1] <= 0 && arr[0] >= 3) {
					arr[0] -= 3;
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
