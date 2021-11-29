package com.itheima_02;

public class Outer {

    // 定义成员方法
    private int num = 10;


    // 定义 内部类
    class Inner {

        // 定义 内部类方法
        void show() {
            System.out.println(num);
        }
    }

    // 内部类一般是使用private来修饰的, 此时Inner是不能被外部直接访问的, 但是我们可以在外部类中定义接口method给外部使用
    public void method() {
        Inner i = new Inner();
        i.show();
    }



}
