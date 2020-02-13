package com.yjh.leetcode;

/*
 * 给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：

'A' : Absent，缺勤
'L' : Late，迟到
'P' : Present，到场
如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 */
public class StudentAttendanceRecordI {

	public static void main(String[] args) {
		boolean checkRecord = checkRecord("LL");
		System.out.println(checkRecord);
	}

	public static boolean checkRecord(String s) {
		return judgeA(s) && judgeL(s);
	}

	public static boolean judgeA(String s) {
		int countA = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A'){
				countA++;
			}
		}
		return countA<=1;
	}

	public static boolean judgeL(String s) {
		
		for (int i = 0; i < s.length()-2; i++) {
			if(s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
				return false;
			}
		}
		return true;
	}
}
