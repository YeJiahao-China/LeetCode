package com.yjh.leetcode;

public class InvalidIPAddress {

	public static void main(String[] args) {
		String defangIPaddr = defangIPaddr("255.100.50.0");
		System.out.println(defangIPaddr);
	}

	public static String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}
}
