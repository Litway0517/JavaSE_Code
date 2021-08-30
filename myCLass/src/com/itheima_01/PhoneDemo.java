package com.itheima_01;

public class PhoneDemo {
    public static void main(String[] args) {

        // 创建对象
        Phone p = new Phone();

        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "OnePlus-8T";
        p.price = 3599;

        System.out.println(p.brand);
        System.out.println(p.price);

        // 调用方法
        p.call();
        p.sendMessage();

    }
}
