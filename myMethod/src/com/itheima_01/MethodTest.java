package com.itheima_01;

public class MethodTest {
    public static void main(String[] args) {
        // 方法调用
        getMax();


    }

    public static void getMax() {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
