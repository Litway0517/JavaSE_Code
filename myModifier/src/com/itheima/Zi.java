package com.itheima;

import cn.itcast.Fu;

// 这里面Zi继承了一下Fu类, 是有关系的
public class Zi extends Fu{
    public static void main(String[] args) {

        // 创建对象, 测试有哪些方法能使用
        Zi z = new Zi();
        z.show3();
        z.show4();

    }
}
