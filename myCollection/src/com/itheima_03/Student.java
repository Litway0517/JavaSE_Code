package com.itheima_03;

/**
 * 学生
 *
 * @author DELL_
 * @date 2021/12/29
 */
public class Student {

    /**
     * 名字
     */// 定义 成员变量
    private String name;
    /**
     * 年龄
     */
    private int age;

    /**
     * 学生
     */// 生成 构造方法
    public Student() {
    }

    /**
     * 学生
     *
     * @param name 名字
     * @param age  年龄
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 得到名字
     *
     * @return {@link String}
     */// get\set方法
    public String getName() {
        return name;
    }

    /**
     * 集名称
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 让年龄
     *
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * 设定年龄
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }


}
