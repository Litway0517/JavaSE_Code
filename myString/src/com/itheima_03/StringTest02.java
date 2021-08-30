package com.itheima_03;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {

        // 键盘录入字符串
        Scanner sc = new Scanner(System.in);

        System.out.println("输入字符串: ");
        String line = sc.nextLine();

        // 遍历字符串
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
        // charAt(int index)函数, 是用来读取对应索引位置的字符值的.


    }
}
