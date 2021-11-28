package com.itheima_05;

public abstract class Coach extends Person{

    // 生成 构造方法

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    // 定义 抽象方法
    public abstract void teach();

}
