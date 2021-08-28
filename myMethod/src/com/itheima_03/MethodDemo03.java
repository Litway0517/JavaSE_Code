package com.itheima_03;

public class MethodDemo03 {
    public static void main(String[] args) {
        // 调用
        int result = sum(10, 20);
        System.out.println(result);

        double resultFloat = sum(10.0, 11.0);
        System.out.println(resultFloat);

        int result1 = sum(5, 7, 11);
        System.out.println(result1);


    }

    // 需求1: 两个int类型数据求和
    private static int sum(int a, int b) {
        return a + b;
    }

    // 需求2: 两个double类型数据求和
    private static double sum(double a, double b) {
        return a + b;
    }

    // 需求3: 三个int类型数据求和
    private static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
