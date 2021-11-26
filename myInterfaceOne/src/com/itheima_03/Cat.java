package com.itheima_03;


public class Cat extends Animal implements Jumping {

    // 写一个类的时候, 别忘了第一时间就是写出 无参\含参 两种构造方法
    // 无参构造方法
    public Cat() {
        super();
    }

    // 含参构造方法
    public Cat(String name, int age) {
        super(name, age);
    }



    // 重写接口中的 抽象类方法
    @Override
    public void Jumping() {
        System.out.println("猫经过训练会跳了");
    }

    // 重写抽象类中的 抽象方法
    @Override
    public void eat() {
        System.out.println("猫吸薄荷");
    }

    // 定义 猫自己独有的方法
    public void show() {
        System.out.println("猫抓老鼠");
    }
}
