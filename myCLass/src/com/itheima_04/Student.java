package com.itheima_04;


public class Student {
    // 成员变量
    private String name;
    private int age;

    // get\set方法
    public void setName(String nanme) {
        this.name = name;               // this.name中的this意思就是本身的意思, 就是指的成员变量, 而不是setName方法中的局部变量了
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

}




