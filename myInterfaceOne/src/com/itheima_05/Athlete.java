package com.itheima_05;

public abstract class Athlete extends Person{


    // 生成 构造方法
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    // 定义 抽象方法
    public abstract void study();
}
