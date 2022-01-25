package com.itheima_04;

/**
 * 狗
 *
 * @author DELL_
 * @date 2022/01/25
 */
public class Dog extends Animal {

    /**
     * 狗
     */
    public Dog() {
    }

    /**
     * 狗
     *
     * @param name 名字
     * @param age  年龄
     */
    public Dog(String name, int age) {
        super(name, age);
    }

    /**
     * 吃
     */
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
}
