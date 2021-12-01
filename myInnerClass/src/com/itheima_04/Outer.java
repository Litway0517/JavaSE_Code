package com.itheima_04;

/*
    前提：
        存在一个类或者接口
        这里的类可以是具体类也可以是抽象类
    格式：
        new类名或者接口名() {
            重写方法；
        };      // 左面这个分号千万别忘了, 因为它就像new Scanner();一样, 分号不能少
    ？本质是什么呢
        是一个继承了该类或者实现了该接口的子类匿名对象

 */


public class Outer {

    public void method() {

        // 定义 匿名内部类
        Inter i = new Inter() {

            // 重写 Inter这个接口的方法
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
        i.show();

    }
}
