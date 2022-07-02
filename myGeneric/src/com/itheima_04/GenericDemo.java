package com.itheima_04;

/*
    测试类
 */

public class GenericDemo {
    public static void main(String[] args) {

        // 创建对象
        Generic<String> g = new GenericImpl<String>();

        g.show("林青霞");
        g.show("TGU");

        // 创建对象
        GenericImpl g2 = new GenericImpl<>();
        g2.show(500);
    }
}
