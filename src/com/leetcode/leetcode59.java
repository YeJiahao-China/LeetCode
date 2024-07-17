package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/16
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * <p>
 * 示例 1：
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 * 示例 2：
 * 输入：n = 1
 * 输出：[[1]]
 */
public class leetcode59 {

    public static void main(String[] args) {
        int[][] ints = generateMatrix(3);

    }

    public static int[][] generateMatrix(int n) {
        int end = n * n;
        int cal  = n-1;
        int[][] ret = new int[n][n];
        // 行和列交替进行  先行再列
        int start = 1; // 起始数字
        int row = 0; // 起始行
        boolean rowJudge = false;
        int col = n - 1; // 起始列
        boolean colJudge = false;

        int shift = 0; // 0代表此次该行赋值，1代表此次该列赋值

        while (start <= end) {

            if (shift == 0) {
                if (!rowJudge) {
                    // 给行赋值 从左往右
                    for (int i = 0; i < n; i++) {
                        if (ret[row][i] == 0) {
                            ret[row][i] = start++;
                        }
                    }
                } else {
                    // 给行赋值 从右往左
                    for (int i = n - 1; i >= 0; i--) {
                        if (ret[row][i] == 0) {
                            ret[row][i] = start++;
                        }
                    }
                }
                shift = 1;
                // 行变化 下次行
                if (rowJudge) row = cal - row + 1;
                else row = cal - row;
                if (rowJudge) rowJudge = false;
                else rowJudge = true;
            } else {

                if (!colJudge){
                    // 给列赋值  从上往下
                    for (int i = 0; i < n; i++) {
                        if (ret[i][col] == 0) {
                            ret[i][col] = start++;
                        }
                    }
                }else {
                    // 给列赋值  从下往上
                    for (int i = n-1; i >=0 ; i--) {
                        if (ret[i][col] == 0) {
                            ret[i][col] = start++;
                        }
                    }
                }

                shift = 0;
                // 列变化
                if (colJudge) col = cal - col - 1;
                else col = cal - col;
                if (colJudge) colJudge = false;
                else colJudge = true;
            }
        }
        return ret;

    }

}
