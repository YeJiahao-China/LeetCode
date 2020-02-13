package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.List;
/*15
"1",
"2",
"Fizz",
"4",
"Buzz",
"Fizz",
"7",
"8",
"Fizz",
"Buzz",
"11",
"Fizz",
"13",
"14",
"FizzBuzz"*/

public class FizzBuzz {

	public static void main(String[] args) {
		List<String> fizzBuzz = fizzBuzz(15);
		for (String string : fizzBuzz) {
			System.out.println(string);
		}
	}

	public static List<String> fizzBuzz(int n) {
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if(i%3==0 && i%5==0){
				list.add("FizzBuzz");
			}else if (i%3==0) {
				list.add("Fizz");
			}else if (i%5==0){
				list.add("Buzz");
			}else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
}
