package com.yjh.leetcode;


/*移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。
机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。*/


public class CanTheRobotReturnToTheOrigin {

	public static void main(String[] args) {
		boolean judgeCircle = judgeCircle("LL");
		System.out.println(judgeCircle);
	}

	public static boolean judgeCircle(String moves) {
		int[] coordinate = {0,0};
		
		for (int i = 0; i < moves.length(); i++) {
			if(moves.charAt(i)=='R'){
				coordinate[1]++;
			}else if (moves.charAt(i)=='L') {
				coordinate[1]--;
			}else if (moves.charAt(i)=='U') {
				coordinate[0]++;
			}else {
				coordinate[0]--;
			}
		}
		if(coordinate[0]==0 &&coordinate[1]==0){
			return true;
		}else {
			return false;
		}
	}
}
