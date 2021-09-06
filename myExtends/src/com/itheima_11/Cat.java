package com.itheima_11;

public class Cat extends Animal{

    // 定义 无参构造方法
    public Cat() {
    }

    // 定义 含参构造方法
    public Cat(String name, int age) {
        super(name, age);
    }

    // 定义 成员方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }


}
