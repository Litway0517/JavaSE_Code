package com.itheima_01;

/*
    测试类
 */

public class JumpingDemo {
    public static void main(String[] args) {

        // 通过多态来实现接口
        Jumping j = new Cat();
        j.Jump();       // 这里是接口被"实例化"\实现了~~~有点疑惑


    }
}
