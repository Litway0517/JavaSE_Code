package com.itheima_04;


public class Cat extends Animal {

    // 定义 成员方法 --> 方法重写
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}
