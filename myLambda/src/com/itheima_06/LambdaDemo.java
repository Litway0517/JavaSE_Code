package com.itheima_06;

/**
 * λ演示
 *
 * @author DELL_
 * @date 2021-08-09
 */


public class LambdaDemo {
    public static void main(String[] args) {

        // Lambda表达式调用
        /*
            userInter(Inter接口的具体实现)
            调用userInter方法需要传入一个参数, 这个参数需要时Inter接口的具体实现
         */
        useInter(() -> {
            System.out.println("好好学习, 天天向上");
        });

        // Lambda省略模式
        useInter(() -> System.out.println("好好学习, 天天向上"));

        /*
            1. Lambda表达式使用时必须要有接口, 而且接口一种有且仅有一个抽象方法
            2. 必须要有上下文环境, 才能推导出对应接口
         */

        // 必须要有上下文环境, 才能推导出对应接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();


        Runnable r = () -> System.out.println("Lambda表达式");
        new Thread(r).start();

        // 合为一条语句就是
        new Thread(() -> System.out.println("Lambda表达式")).start();
        // 此时, 根据Thread的构造方法, 可知: 内部的() -> System.out.println("Lambda表达式")是一个接口的实现类, 就是Runnable的实现类, 因此重写的就是run方法


    }

    private static void useInter(Inter i) {
        i.show();
    }
}
