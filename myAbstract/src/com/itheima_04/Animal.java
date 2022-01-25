package com.itheima_04;

/**
 * 动物
 *
 * @author DELL_
 * @date 2022/01/25
 */
public abstract class Animal {

    /**
     * 名字
     */// 定义 成员变量
    private String name;
    /**
     * 年龄
     */
    private int age;

    // 生成 无参构造方法
    public Animal() {
    }

    // 生成 含参构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 生成 get\set方法
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
