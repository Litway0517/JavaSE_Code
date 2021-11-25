package com.itheima_06;

/*
    测试类
 */

public class AnimalDemo {
    public static void main(String[] args) {

        // 创建对象并测试
        // 向上转型
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();        // 并不会输出"动物吃东西", 调用方法时, 编译看左面, 但是运行看右面. 而Cat类中重写了eat成员方法, 因此输出的是"猫抓老鼠".
//        a.playGame();

        System.out.println("--------------------");


        // 向下转型
        a = (Cat) a;
        a = new Cat("加菲", 4);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();


    }
}
