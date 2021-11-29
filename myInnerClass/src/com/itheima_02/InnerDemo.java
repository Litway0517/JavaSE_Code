package com.itheima_02;

/*
    测试类
 */

public class InnerDemo {
    public static void main(String[] args) {

        // 创建内部类对象
        // 注意格式
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        System.out.println("----------");

        // 通过类的方法间接调用内部类的方法
        Outer o = new Outer();
        o.method();




    }
}
