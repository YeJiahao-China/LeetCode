package com.yjh.leetcode;

public class BinarySum {

	public static void main(String[] args) {
		String addBinary = addBinary("1111", "1111");
		System.out.println(addBinary);
	}

	public static String addBinary(String a, String b) {
		int lenga = a.length();
		int lengb = b.length();
		if (lenga > lengb) {
			// 补全b的高位
			char[] charArray = b.toCharArray();
			StringBuffer stringBuffer = new StringBuffer();
			int index = 0;
			for (int i = 0; i < lenga; i++) {
				if (i >= (lenga - lengb)) {
					stringBuffer.append(charArray[index]);
					index++;
				} else {
					stringBuffer.append(0);
				}
			}
			b = stringBuffer.toString();
		}
		if (lengb > lenga) {
			// 补全b的高位
			char[] charArray = a.toCharArray();
			StringBuffer stringBuffer = new StringBuffer();
			int index = 0;
			for (int i = 0; i < lengb; i++) {
				if (i >= (lengb - lenga)) {
					stringBuffer.append(charArray[index]);
					index++;
				} else {
					stringBuffer.append(0);
				}
			}
			a = stringBuffer.toString();
		}
		String res = new String();
		String temp = twoStringPlus(a, b, res, 0);
		String result = new String();
		int index = temp.length()-1;
		while (index>=0) {
			result+=temp.charAt(index);
			index--;
		}
		return result;
	}

	public static String twoStringPlus(String str1, String str2, String res, int count) {
		if (str1.length() == 0 && str2.length() == 0) {
			if (count != 0) {
				res += count;
			}
			return res;
		}
		int index = str1.length() - 1;
		int parseInt1 = Integer.parseInt(str1.substring(index));
		int parseInt2 = Integer.parseInt(str2.substring(index));
		int i = parseInt1 + parseInt2 + count;
		if (i >= 2) {
			res += (i-2);
			count = 1;
		}else {
			res+=i;
			count = 0;
		}
		

		return twoStringPlus(str1.substring(0, index), str2.substring(0, index), res, count);
	}
}
