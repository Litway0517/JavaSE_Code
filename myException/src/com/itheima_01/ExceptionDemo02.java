package com.itheima_01;

/*
    JVM处理的默认方案
        如果出现了异常, 那么给出异常名称, 异常原因, 异常位置, 默认结束程序, 不再向下执行.
 */

/**
 * 异常demo02
 *
 * @author DELL_
 * @date 2021-09-04
 */


public class ExceptionDemo02 {
    public static void main(String[] args) {

        System.out.println("start");
        method();
        System.out.println("end");


    }

    public static void method() {
        int[] arr = {1, 3, 3};
        System.out.println(arr[1]);
        System.out.println(arr[3]); // 异常
    }
}
