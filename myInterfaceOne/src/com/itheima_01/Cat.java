package com.itheima_01;

public class Cat implements Jumping{

    @Override       // 实现的时候, 必须重写所有 抽象类方法, 不然, 就将该类定义为抽象类 --> abstract
    public void Jump() {
        System.out.println("猫能跳高了");
    }
}
