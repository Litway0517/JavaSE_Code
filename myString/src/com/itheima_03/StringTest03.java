package com.itheima_03;

import java.util.Scanner;

/**
 * 字符串test03
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class StringTest03 {
    public static void main(String[] args) {

        // 统计字符串
        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个字符串: ");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < line.length(); i++) {

            char ch = line.charAt(i);           // 下面的if判断每次都写line.charAt(); 太麻烦了, 用一个ch变量不方便吗?
            if (ch >= 'A' && ch <= 'Z') {       // 别忘了等于号
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母: " + bigCount + "小写字母: " + smallCount + "数字: " + numberCount);


    }
}
