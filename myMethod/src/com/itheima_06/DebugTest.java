package com.itheima_06;

import java.util.Scanner;

public class DebugTest {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);

        // 接收数据
        System.out.println("输入两个数据: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 调用对象
        int maxNumber = getMax(a, b);
        System.out.println("较大值为: " + maxNumber);

    }

    public static int getMax(int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
}


