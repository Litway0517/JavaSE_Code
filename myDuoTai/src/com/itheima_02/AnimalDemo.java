package com.itheima_02;


/*
    测试类
 */

/**
 * 动物的演示
 *
 * @author DELL
 * @date 2021/10/07
 */
public class AnimalDemo {
    public static void main(String[] args) {

        // 有父类引用指向子类对象
        Animal a = new Cat();

        // 成员变量a的编译看左面, 运行看左面. 因为Animal里面的age为40, 所以输出40.
        System.out.println(a.age);
//        System.out.println(a.weight); // 因为父类Animal里面没有weight, 所以不能访问 -> 报错


        // 同理, 方法也是看左面:
        a.eat();        // 多态的方法, 编译看左面, 运行看右面.
//        a.playGame();     // 同样报错, 编译就出错了. 因为Animal类没有playGame()这个成员方法

        String s = "abcd";
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);
    }
}











