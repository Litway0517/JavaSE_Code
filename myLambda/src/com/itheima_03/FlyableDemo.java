package com.itheima_03;

/**
 * 可以飞行的演示
 *
 * @author DELL_
 * @date 2021-08-09
 */

/*
    Lambda表达式的格式：（形式参数）>{代码块}

    练习2：
    1：定义一个接口（Flyable），里面定义一个抽象方法：void fly（String s）；
    2：定义一个测试类（FlyableDemo），在测试类中提供两个方法
        一个方法是：useFlyable（Flyable f）
        一个方法是主方法，在主方法中调用useFlyable方法
 */

public class FlyableDemo {
    public static void main(String[] args) {

        // 定义一个接口(Flyable），里面定义一个抽象方法：void fly（String s);
        // 定义一个测试类（FlyableDemo），在测试类中提供两个方法

        // 匿名内部类事项
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                // 这个s是下面的方法传入的参数
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });

        System.out.println("--------");

        // Lambda方式调用
        useFlyable( (String s) -> {
            // 这个s的值来自于下面的函数的s
            System.out.println(s);
            System.out.println("飞机自驾游");
        });


    }

    // 一个方法是：useFlyable（Flyable f)
    private static void useFlyable(Flyable f) {
        f.fly("风和日丽, 晴空万里");
    }
}
