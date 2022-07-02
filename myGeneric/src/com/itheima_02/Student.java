package com.itheima_02;

public class Student {
    /**
     * 姓名
     */
    private String name;

    /**
     * 学生
     */
    public Student() {
    }

    /**
     * 学生
     *
     * @param name 姓名
     */
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
