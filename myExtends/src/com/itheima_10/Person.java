package com.itheima_10;

public class Person {

    // 定义成员变量
    private String name;
    private int age;

    // 无参构造方法
    public Person() {
    }

    // 有参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // set\get成员变量方法
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
