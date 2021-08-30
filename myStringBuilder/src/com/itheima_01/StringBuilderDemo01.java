package com.itheima_01;

/**
 * 字符串生成器demo01
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class StringBuilderDemo01 {
    public static void main(String[] args) {

        // 创建对象
        StringBuilder sb = new StringBuilder();
        System.out.println(sb + ", " + sb.capacity());
        System.out.println("sb: " + sb);
        System.out.println("sb.length: " + sb.length());
        System.out.println("sb.capacity: " + sb.capacity());    // 默认容量16

        // 根据字符串内容创建StringBuilder
        String s = "hello";
        StringBuilder sb1 = new StringBuilder(s);
        System.out.println("sb1: " + sb1);
        System.out.println("sb1.length: " + sb1.length());


    }
}
