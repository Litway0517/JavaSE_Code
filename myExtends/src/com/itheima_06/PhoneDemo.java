package com.itheima_06;

/*
    测试类
 */

/**
 * 电话演示
 *
 * @author DELL
 * @date 2021/09/06
 */


public class PhoneDemo {
    public static void main(String[] args) {

        // 创建对象, 调用方法
        Phone p = new Phone();
        p.call("林青霞");

        System.out.println("----------");

        NewPhone np = new NewPhone();
        np.call("林青霞");
    }
}
