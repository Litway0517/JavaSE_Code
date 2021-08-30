package com.itheima_03;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {

        // 翻转字符串
        Scanner sc = new Scanner(System.in);

        System.out.println("输入字符串: ");
        String line = sc.nextLine();

        String reverseLine = reverse(line);
        System.out.println("反转结果: " + reverseLine);


    }

    // 定义方法
    public static String reverse(String s) {
        String ss = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }

        return ss;
    }

}
