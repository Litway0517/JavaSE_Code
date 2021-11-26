package com.itheima_02;

/*
    测试类
 */

public class AnimalDemo {
    public static void main(String[] args) {

        // 抽象类本身是不能被实例化的, 若想实例化必须通过 向上转型 --> 父类引用指向子类对象
        // 就是通过多态的方式实现实例化
        // 向上转型
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
