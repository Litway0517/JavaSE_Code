package com.itheima_02;

public class StringDemo02 {
    public static void main(String[] args) {

        // 比较字符串
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        // 赋值比较
        String s3 = "abc";
        String s4 = "abc";

        // 比较地址值是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println("------------");

        // 比较内容是否相等
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));


    }

}
