package com.itheima_01;

/*
        内部类格式：
        public class 类名{
            修饰符class类名{}
        }
    内部类访问特点：
        1- 内部类可以直接访问外部类的成员，包括私有成员也可以访问
        2- 外部类要访间内部类的成员，必须创建对象

 */

public class Outer {


    // 定义 私有成员变量
    private static final String university = "天津工业大学";


    // 这个就是内部类Inner
    public class Inner {

        public void show() {
            System.out.println(university);

            // 实例化外部类, 并且调用方法(循环)
            Outer outer = new Outer();
            outer.method();
        }
    }


    // 这是外部类的方法, 即method是Outer类的成员方法
    public void method() {
        Inner i = new Inner();
        i.show();

    }


}
