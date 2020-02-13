package com.yjh.leetcode;

/*import java.util.ArrayList;
import java.util.HashMap;*/

public class FindCommonCharacters {

	public static void main(String[] args) {

	}

	/*public static List<String> commonChars(String[] A) {
		ArrayList<HashMap<String, Integer>> mlist = new ArrayList<HashMap<String, Integer>>();
		for (int i = 0; i < A.length; i++) {
			String string = A[i];
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			for (int j = 0; j < string.length(); j++) {
				if(map.get(String.valueOf(string.charAt(i)))==null){
					map.put(String.valueOf(string.charAt(i)), 1);
				}else {
					Integer integer = map.get(String.valueOf(string.charAt(i)));
					integer++;
					map.put(String.valueOf(string.charAt(i)), integer);
				}
			}
			mlist.add(map);
		}
		
	}*/
}
