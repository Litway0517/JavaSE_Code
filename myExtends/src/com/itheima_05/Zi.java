package com.itheima_05;

/**
 * 子
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Zi extends Fu {

    // 定义成员方法
    public void method() {
        System.out.println("Zi类中的method()方法被调用");
    }

    public void show() {
        super.show();
        System.out.println("Zi类中的show()方法被调用");
    }
}
