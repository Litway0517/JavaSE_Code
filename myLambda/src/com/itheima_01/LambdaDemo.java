package com.itheima_01;


/**
 * λ演示
 *
 * @author DELL_
 * @date 2021-08-08
 */

/*
    需求：启动一个线程，在控制台输出一句话：多线程程序启动了
 */

public class LambdaDemo {
    public static void main(String[] args) {

        // 实例化具体类
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();


        // 使用匿名内部类 --> 简化一下 --> 这种方式并没有创建一个类文件
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程启动了2....");
            }
        }).start();


        // 使用lambda方式 --> 指向的是Runnable中的run方法
        new Thread( () -> {
            System.out.println("多线程启动了3....");
        } ).start();
    }
}
