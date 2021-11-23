package com.itheima_04;

/*
    向上转型
        从子到父
        父类引用指向子类对象
    向下转型
        从父到子
        父类引用转为子类对象
 */

public class AnimalDemo {
    public static void main(String[] args) {

        // 多态
        Animal a = new Cat();   // 向上转型 --> 因为是右面的Cat()是赋值给Animal的.
        a.eat();        // 编译看左边的Animal类中的eat()方法, 编译通过, 因为Animal类中有eat()方法. 但是运行看右面的Cat中eat()方法.
//        a.playGame();   // 报错, 因为Animal类中压根没有playGame()方法, 编译不通过.

        System.out.println("-------------------");

        Cat c = new Cat();
        c.eat();
        c.playGame();
        // 这样是能使用eat()和playGame()方法了, 但是内存中有两个Cat()对象啊? 浪费内存, 没必要

        System.out.println("-------------------");

        // 向下转型 --> 这样就能解决上面的问题
        Cat cat = (Cat)a;   // 有点类型强制转换的感觉
        cat.eat();
        cat.playGame();

    }
}
