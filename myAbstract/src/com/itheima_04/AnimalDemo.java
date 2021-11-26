package com.itheima_04;

/*
    测试类
 */

public class AnimalDemo {
    public static void main(String[] args) {

        // 创建方法, 多态
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        System.out.println("---------");

        Animal a1 = new Cat("加菲", 3);
        System.out.println(a1.getName() + ", " + a1.getAge());
        a1.eat();


        // 狗类是一样的
    }
}
