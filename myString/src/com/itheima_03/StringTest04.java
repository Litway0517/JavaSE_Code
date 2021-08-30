package com.itheima_03;

public class StringTest04 {
    public static void main(String[] args) {

        // 静态初始化一个int数组
        int[] arr = {1, 3, 67};

        // 调用方法
        String s = arrayToString(arr);
        System.out.println("字符串: " + s);

    }

    public static String arrayToString(int[] arr) {
        String s = "";

        s += "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";

        return s;
    }
}
