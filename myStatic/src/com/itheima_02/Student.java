package com.itheima_02;

public class Student {

    // 非静态成员变量
    private String name = "林青霞";

    // 静态成员变量
    private static String university = "传智大学";

    // 非静态成员方法
    public void show1() {
    }

    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    // 静态成员方法
    public static void show3() {
    }

    public static void show4() {
//        System.out.println(name); // 报错
        System.out.println(university);
//        show1();  // 报错
        show3();
    }
}
