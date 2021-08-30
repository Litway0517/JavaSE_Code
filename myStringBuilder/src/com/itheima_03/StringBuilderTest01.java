package com.itheima_03;

/**
 * 字符串生成器test01
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class StringBuilderTest01 {
    public static void main(String[] args) {

        // 使用StringBuilder实现字符串的拼接

        // 静态定义初始化int数组
        int[] arr = {1, 15, 95, 23};

        // 调用方法
        String s = arrayToString(arr);
        System.out.println("s: " + s);



    }

    // 定义方法, 通过StringBuilder来实现int数组中的字符串输出
    public static String arrayToString(int[] arr) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");

        String s = sb.toString();
        return s;
    }
}
