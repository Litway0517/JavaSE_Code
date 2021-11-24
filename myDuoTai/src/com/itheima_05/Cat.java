package com.itheima_05;

public class Cat extends Animal{

    // 重写方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}
