package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/11
 */
public class leetcode367 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }


    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid == num) {
                return true;
            } else if ((long) mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return false;
    }
}
