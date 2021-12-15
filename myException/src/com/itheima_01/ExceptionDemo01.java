package com.itheima_01;

/**
 * 异常demo01
 *
 * @author DELL_
 * @date 2021-09-04
 */


public class ExceptionDemo01 {
    public static void main(String[] args) {        // main方法必须是static类型的, 而static静态类型的方法只能调用静态类型方法

        // 静态方法只能调用静态方法
        method();
    }

    // 定义静态方法
    public static void method() {
        int[] arr = {1, 5, 9};
        System.out.println(arr[1]);
        System.out.println(arr[3]);     // ArrayIndexOutOfBoundsException
        System.out.println(arr[2]);
    }
}
