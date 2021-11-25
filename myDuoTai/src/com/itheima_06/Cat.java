package com.itheima_06;

public class Cat extends Animal{

    // 生成 无参构造方法
    public Cat() {
    }

    // 生成 有参构造方法
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫抓老鼠");
    }

    public void playGame() {
        System.out.println("猫的成员方法");
    }
}
