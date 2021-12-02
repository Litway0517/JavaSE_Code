package com.itheima_05;

public class JumpingDemo {
    public static void main(String[] args) {

        // 创建 接口操作类, 调用jump方法
        JumpingOperator jo = new JumpingOperator();

        // method需要传入 接口Jumping的实现类对象 --> Cat
        Jumping j = new Cat();
        jo.method(j);

        // 猫能够跳高, 狗也能跳高, 但是, 这些类可能仅仅使用一次, 就得创建一个类, 非常不便于管理, 这里的匿名内部类就是解决这个问题的

        System.out.println("-----------");


        // 创建一个匿名内部类, 且需要是实现了Jumping接口的对象
        Jumping j2 = new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        };
        jo.method(j2);

        // 其本质: 是继承了该类的子类匿名对象 或者 是实现了该接口的子类的匿名对象

    }
}
