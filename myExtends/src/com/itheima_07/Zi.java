package com.itheima_07;

/**
 * 子
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Zi extends Fu {

    // 尝试重写父类中的成员方法
    /*
    @Override       // 因为父类中的方法是私有的, 不允许子类重写
    public void show() {
        System.out.println("Zi类中重写show()方法");
    }
    */

    // show方法时private, 但是method方法不是private, 可以重写

    @Override
    public void method() {
        System.out.println("Zi类中method()方法被调用");
    }
}
