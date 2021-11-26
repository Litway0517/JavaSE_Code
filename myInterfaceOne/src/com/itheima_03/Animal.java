package com.itheima_03;

public abstract class Animal {

    // 定义 成员变量
    private String name;
    private int age;


    public Animal() {
    }


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    // 定义 抽象方法
    public abstract void eat();
}
