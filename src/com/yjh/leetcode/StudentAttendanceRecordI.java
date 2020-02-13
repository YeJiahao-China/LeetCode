package com.yjh.leetcode;

/*
 * ����һ���ַ���������һ��ѧ���ĳ��ڼ�¼�������¼���������������ַ���

'A' : Absent��ȱ��
'L' : Late���ٵ�
'P' : Present������
���һ��ѧ���ĳ��ڼ�¼�в�����һ��'A'(ȱ��)���Ҳ���������������'L'(�ٵ�),��ô���ѧ���ᱻ���͡�
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
