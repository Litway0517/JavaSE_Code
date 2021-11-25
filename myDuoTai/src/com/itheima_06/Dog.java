package com.itheima_06;

public class Dog extends Animal{

    // 生成 无参构造方法
    public Dog() {
    }

    // 生成 含参构造方法
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
}
