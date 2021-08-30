package com.itheima_01;

import java.util.Scanner;


/*
    public String nextLine​()
*/

public class ScannerDemo {
    public static void main(String[] args) {

        // 创建对下那个
        System.out.println("输入数据: ");
        Scanner sc = new Scanner(System.in);    // 这里new Scanner(System.in) 实际上是调用构造方法, 而System.in就是参数

        // 接收数据
        String line = sc.nextLine();        // 对象调方法, 如果有返回值, 那么我们就接收, 使用Ctrl+Alt+v快捷键实现
        System.out.println("输入的数据是: " + line);


    }
}
