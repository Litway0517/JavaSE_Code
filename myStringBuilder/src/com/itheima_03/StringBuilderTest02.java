package com.itheima_03;

import java.util.Scanner;

/**
 * 字符串生成器test02
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class StringBuilderTest02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("输入字符串: ");
        String line = sc.nextLine();

        String s = myReverse(line);
        System.out.println("reverse: " + s);


    }

    // 使用StringBuilder实现字符串的翻转
    public static String myReverse(String s) {

//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String result = sb.toString();
//        return result;

        // 上面几行代码可以一行实现
        return new StringBuilder(s).reverse().toString();
        // 这里new StringBuilder为什么能够调用reverse方法? 因为他是一个匿名变量.

    }
}
