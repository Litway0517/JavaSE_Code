package com.itheima_02;

/*
    测试类
 */

public class InterfaceDemo {
    public static void main(String[] args) {

        // 通过多态实现接口
        Inter i = new InterImpl();
        System.out.println(i.age);
        System.out.println(i.num);

        // 通过 接口直接访问接口的"变量"
        System.out.println(Inter.age);
        System.out.println(Inter.num);

        i.show();
        i.method();

    }
}
