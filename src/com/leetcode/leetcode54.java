package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JHYe
 * @date 2024/7/16
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 */
public class leetcode54 {


    public static void main(String[] args) {
        List<Integer> integers = spiralOrder1(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
//        List<Integer> integers = spiralOrder1(new int[][]{{6, 9, 7}});
        integers.stream().forEach(System.out::println);
    }


    public static List<Integer> spiralOrder1(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;// 总行
        int n = matrix[0].length; // 总列
        int row = 0; // 起始行
        int col = n - 1; // 起始列
        int calRow = m - 1;
        int calCol = n - 1;
        boolean rowJudge = false; // false代表行从左往右，true代表行从右往左
        boolean colJudge = false; // false代表行从上往下，true代表行从下往上
        List<Integer> rowset = new ArrayList<>(m);
        List<Integer> colset = new ArrayList<>(n);
        int shift = 0; // 0代表此次该行赋值，1代表此次该列赋值

        while (rowset.size() <= m && colset.size() <= n) {

            if (rowset.size() == m && colset.size() == n) {
                break;
            }
            if (shift == 0) {
                if (!rowset.contains(row)) {
                    rowset.add(row);
                    if (!rowJudge) {
                        // 从左往右拿数据
                        for (int i = 0; i < n; i++) {
                            if (!colset.contains(i)) {
                                list.add(matrix[row][i]);
                            }
                        }
                    } else {
                        // 从右往左拿数据
                        for (int i = n - 1; i >= 0; i--) {
                            if (!colset.contains(i)) {
                                list.add(matrix[row][i]);
                            }
                        }
                    }
                    row = rowJudge ? calRow - row + 1 : calRow - row;
                    rowJudge = !rowJudge;
                }
                shift = 1;
            } else {
                if (!colset.contains(col)) {
                    colset.add(col);
                    if (!colJudge) {
                        //  从上往下
                        for (int i = 0; i < m; i++) {
                            if (!rowset.contains(i)) {
                                list.add(matrix[i][col]);
                            }
                        }
                    } else {
                        //  从下往上
                        for (int i = m - 1; i >= 0; i--) {
                            if (!rowset.contains(i)) {
                                list.add(matrix[i][col]);
                            }
                        }
                    }
                    col = colJudge ? calCol - col - 1 : calCol - col;
                    colJudge = !colJudge;
                }
                shift = 0;
            }
        }
        return list;
    }
}
