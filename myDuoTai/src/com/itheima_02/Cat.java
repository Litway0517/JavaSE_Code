package com.itheima_02;

public class Cat extends Animal {

    public int age = 20;
    public int weight = 10;

    // 重写父类方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}
