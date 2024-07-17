package com.leetcode;

/**
 * @author JHYe
 * @date 2024/7/11
 */
public class leetcode69 {


    public static void main(String[] args) {
//        1,2,3,4,5,6,7,8
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return right * right > x ? left : right; //  return right
    }
}
