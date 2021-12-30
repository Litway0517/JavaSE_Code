package com.itheima_02;

/**
 * 学生
 *
 * @author DELL_
 * @date 2021/12/30
 */
public class Student {

    /**
     * 名字
     */// 定义成员变量
    private String name;
    /**
     * 年龄
     */
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
}
