package com.yjh.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。

字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
*/
public class MaximumNumberOfBalloons {

	public static void main(String[] args) {
		int maxNumberOfBalloons = maxNumberOfBalloons("loonbalxballpoon");
		System.out.println(maxNumberOfBalloons);
	}

	public static int maxNumberOfBalloons(String text) {
		if(text.length()<7){
			return 0;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'b' || text.charAt(i) == 'a' || text.charAt(i) == 'n' || text.charAt(i) == 'l'
					|| text.charAt(i) == 'o') {
				if (map.get(text.charAt(i)) == null) {
					map.put(text.charAt(i), 1);
				} else {
					Integer count = map.get(text.charAt(i));
					count++;
					map.put(text.charAt(i), count);
				}
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getKey()=='l' || entry.getKey()=='o'){
				list.add(entry.getValue()/2);
			}else {
				list.add(entry.getValue());
			}
		}
		if(list.size()<5){
			return 0;
		}else {
			int res = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if(list.get(i)<res){
					res = list.get(i);
				}
			}
			return res;
		}
	}
}
