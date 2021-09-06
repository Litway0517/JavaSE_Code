package com.itheima;

import cn.itcast.Fu;

/*
    测试类
 */

public class Demo {
    public static void main(String[] args) {

        // 创建Fu类的对象, 注意需要导包
        // 不同包的无关类, 只能调用公用方法, 即public修饰的方法
        Fu f = new Fu();
        f.show4();

    }
}
