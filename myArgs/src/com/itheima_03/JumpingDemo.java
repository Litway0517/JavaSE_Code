package com.itheima_03;

/*
    测试类
 */

public class JumpingDemo {
    public static void main(String[] args) {

        // 创建对象
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();      // 用实现了该接口的类来实例化.
        jo.useJumping(j);

        System.out.println("----------");

        Jumping j2 = jo.getJumping();
        j2.Jump();
    }
}
