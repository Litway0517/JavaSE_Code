package com.itheima_10;

public class Student extends Person{

    // 定义无参构造方法

    public Student() {
    }

    // 定义含参构造方法 需要使用super去调用父类的方法 --> 使用Alt+Insert来实现
    public Student(String name, int age) {
        super(name, age);
    }

    // 定义成员方法
    public void study() {
        System.out.println("好好学习, 天天向上");
    }

}
