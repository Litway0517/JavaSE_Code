package com.itheima_05;

public class Cat implements Jumping {

    // 重写 接口中的抽象方法

    @Override
    public void jump() {
        System.out.println("猫能跳高了");
    }
}
