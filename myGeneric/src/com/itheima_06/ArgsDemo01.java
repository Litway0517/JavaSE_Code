package com.itheima_06;

public class ArgsDemo01 {
    public static void main(String[] args) {

        // 调用
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

    }

    // 使用可变参数
    // 此时sum方法可以传入多个参数, 个数时可变的
    // 若函数还包括其他参数, 那么应该把其他参数放在前面, 可变参数放到最后
    public static int sum(int... a) {
        // a实际上被封装成了一个int数组
        System.out.println(a);      // [I@880ec60   这个内存地址指的是: int行数组

        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    /*public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/
}
