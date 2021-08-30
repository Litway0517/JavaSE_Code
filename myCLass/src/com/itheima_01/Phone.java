package com.itheima_01;


/*
    手机类：
    类名：
        手机（Phone）
    成员变量：
        品牌（brand）
        价格（price）
    成员方法：
        打电话（calL）
        发短信（sendMessage）
 */


/**
 * 电话
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class Phone {                // 没有main函数
        // 成员变量
        String brand;
        int price;

        // 定义方法
        public void call() {        // 注意, 不需要再写static了
            System.out.println("打电话");
        }


        // 成员方法 --> 成员的意思是, 类定义完毕之后,我们会按照类生成一个对象, 一个对象就是一个成员, 对象拥有的变量自然就叫做成员变量喽, 拥有的方法就叫做成员方法
        public void sendMessage() {
            System.out.println("发短信");
        }
}
