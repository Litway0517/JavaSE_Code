package com.itheima_11;


public class Dog extends Animal{

    // 定义 无参构造方法
    public Dog() {
    }

    // 定义 含参构造方法
    public Dog(String name, int age) {
        super(name, age);
    }

    // 定义成员方法
    public void lookDoor() {
        System.out.println("狗看门");
    }
}
