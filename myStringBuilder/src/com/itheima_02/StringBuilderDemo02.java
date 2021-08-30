package com.itheima_02;

/**
 * 字符串生成器demo02
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class StringBuilderDemo02 {
    public static void main(String[] args) {

        // 创建对象
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        // 使用toString转换
        String s = sb.toString();
        System.out.println("s: " + s);

        // ----------------
        // String转换为StringBuilder
        String s1 = "hello";
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println("sb1: " + sb1);

    }
}
