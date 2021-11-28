package com.itheima_03;

/*
    测试类
 */

public class JumpingDemo {
    public static void main(String[] args) {

        // 创建对象
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();      // 用实现了该接口的类来实例化.
        Cat cat = new Cat();

        // userJumping这个方法需要的是一个接口, 因此上面需要通过一个该接口的实现类传入. 下面两行都是正确的
        jo.useJumping(j);
        jo.useJumping(cat);

        System.out.println("----------");

        Jumping j2 = jo.getJumping();
        j2.Jump();
    }
}
