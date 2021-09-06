package com.itheima_11;

public class Animal {

    // 定义 成员变量
    private String name;
    private int age;

    // 定义 无参构造方法
    public Animal() {
    }

    // 定义 含参构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 定义 set\get成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
