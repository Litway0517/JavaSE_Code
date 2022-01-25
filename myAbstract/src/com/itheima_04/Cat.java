package com.itheima_04;

/**
 * 猫
 *
 * @author DELL_
 * @date 2022/01/25
 */
public class Cat extends Animal {

    /**
     * 猫
     */
    public Cat() {
    }

    /**
     * 猫
     *
     * @param name 名字
     * @param age  年龄
     */
    public Cat(String name, int age) {
        super(name, age);
    }

    /**
     * 吃
     */
    @Override
    public void eat() {
        System.out.println("猫抓老鼠");
    }
}
