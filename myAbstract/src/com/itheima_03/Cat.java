package com.itheima_03;

/**
 * 猫
 *
 * @author DELL_
 * @date 2022/01/25
 */
public class Cat extends Animal{

    public Cat() {
        super(10, "test");
    }

    /**
     * 吃
     */
    @Override
    public void eat() {
        System.out.println("猫抓老鼠");
    }
}
