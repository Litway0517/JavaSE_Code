package com.itheima_05;


public class Student {
    // 成员变量
    private String name;
    private int age;

    // 构造方法, 当创建对象, 实体化的时候, 会自动执行构造方法里面的代码. 默认执行的.
    // 如果不写下面几行的构造方法, 那么系统实际上会默认给出一个无参的构造方法.
    // 构造方法可以有多个

    // 构造方法1
    public Student() {}

    // 构造方法2
    public Student(String name) {
        this.name = name;
    }

    // 构造方法3
    public Student(int age) {
        this.age = age;
    }

    // 构造方法4
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
