package com.leetcode;


/**
 * @author JHYe
 * @date 2024/7/5
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * 注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。
 * 示例 1:
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * <p>
 * 示例 2:
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 */
public class leetcode43 {

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));

    }

    public static String multiply(String num1, String num2) {// 991*99
        if (num1.equals("0") || num2.equals("0")) return "0";
        StringBuffer sb = new StringBuffer();
        int n = num1.length() + num2.length();
        int[] ret = new int[n]; // [0,0,0,0,0]
        int remainIndex = ret.length - 1;// 每一轮存放余数的起始位置，从ret的最后一个位置开始
        for (int j = num2.length() - 1; j >= 0; j--) { // 下面的字符串
            int remainIndexTemp = remainIndex--;
            int[] retTemp = new int[n];
            int a = num2.charAt(j) - '0'; // 下面的数字
            int carry = 0; // 进位初始为0
            for (int i = num1.length() - 1; i >= 0; i--) {// 上面的字符串
                int b = num1.charAt(i) - '0'; // 上面的数字
                int temp = a * b + carry;
                int remainder = temp % 10; // 余数,把余数放到对应的数组位置上
                carry = temp / 10; // 进位
                if (i == 0) {
                    retTemp[remainIndexTemp - 1] = carry;
                }
                retTemp[remainIndexTemp] = remainder;
                remainIndexTemp--;
            }
            // 更新ret
            int carryTemp = 0;
            for (int k = ret.length - 1; k >= 0; k--) {
                int kTemp = ret[k] + retTemp[k] + carryTemp;
                carryTemp = kTemp / 10;
                ret[k] = kTemp % 10;
            }
        }
        for (int i = 0; i < ret.length; i++) {
            if (sb.length()!=0 || ret[i]!=0){
                sb.append(ret[i]);
            }
        }
        return  sb.toString();
    }

}
