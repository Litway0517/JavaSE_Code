package com.itheima_01;

/**
 * 我的界面演示
 *
 * @author DELL_
 * @date 2021-08-09
 */

/*
    需求：

    1：定义一个接口MyInterface，里面有两个抽象方法：
        void show1（）；
        void show2（）；
    2：定义接口的两个实现类：
        MyInterfaceImplOne
        MyInterfaceImpl Two
    3：定义测试类：
        MyInterfaceDemo在主方法中，按照多态的方式创建对象并使用
 */

public class MyInterfaceDemo {
    public static void main(String[] args) {

        // 多态方式创建接口对象
        MyInterface my = new MyInterfaceImplOne();
        my.show1();
        my.show2();

        my.show3();

        System.out.println("--------");

        // 多态创建对象
        MyInterface my2 = new MyInterfaceImplTwo();
        my2.show1();
        my2.show2();

        my2.show3();

    }
}














