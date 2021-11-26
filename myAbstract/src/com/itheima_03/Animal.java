package com.itheima_03;

/*
    抽象类Animal
 */

public abstract class Animal {

    // 定义 成员变量
    private int age = 20;
    private final String city = "北京";

    // 定义 无参构造方法(即使抽象类不能实例化, 但是能够通过其继承的子类实现实例化, 所以一旦子类实例化必须要先调用父类的构造方法)
    public Animal() {
    }

    // 定义 含参构造方法
    public Animal(int age, String city) {
        System.out.println(age + ", " + city);
    }

    // 定义 抽象成员方法
    public abstract void eat();

    // 定义 非抽象成员方法
    public void show() {
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }


}
