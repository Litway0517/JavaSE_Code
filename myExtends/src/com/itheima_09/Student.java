package com.itheima_09;

/**
 * 学生
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Student {

    // 定义成员变量
    private String name;
    private int age;


    // 定义无参构造方法
    public Student() {}

    // 定义有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // get\set方法
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

    // 定义成员方法
    public void study() {
        System.out.println("好好学习,天天向上");
    }

}
