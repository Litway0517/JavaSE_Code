package com.itheima_02;

/**
 * 学生
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    学生类
 */

public class Student {
    /**
     * 的名字
     */
    private String name;

    /**
     * 年龄
     */
    int age;

    /**
     * 地址
     */
    public String address;

    // 构造方法 -> 一个私有 一个默认 一个公共

    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    // 成员方法 -> 一个私有, 四个公共

    private void function() {
        System.out.println("function函数被执行");
    }

    public void method1() {
        System.out.println("method1方法被执行");
    }

    public void method2(String s) {
        System.out.println("method2被执行: " + s);
    }

    public String method3(String s, int i) {
        return s + "," + i;
    }


    // 重写toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
