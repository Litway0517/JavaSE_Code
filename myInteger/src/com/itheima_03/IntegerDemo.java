package com.itheima_03;

public class IntegerDemo {
    public static void main(String[] args) {

        // int --- String
        // way1
        int number = 100;
        String s = "" + number;
        System.out.println(s);

        // way2
        // public static String valueOf​(int i)     valueOf方法, 是传入一个数字, 把数字转成字符串的类型.
        String s2 = String.valueOf(number);
        s2 += "TGU";
        System.out.println(s2);
        System.out.println("--------");

        // String --- int
        String ss = "100";

        // way1: String --- Integer --- int
        Integer i = Integer.valueOf(ss);
        int x = i.intValue();
        System.out.println(x);

        // way2: String --- int
        int i1 = Integer.parseInt(ss);  // 这个方法居然在Integer下面
        System.out.println(i1);


        // testIO: String --- float
        String sf = "3.14159267425425";
        float f = Float.parseFloat(sf);
//        f += 1.0;
        System.out.println(f);


    }
}
