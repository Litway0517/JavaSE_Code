package com.myArrar;

/**
 * 数组的演示
 *
 * @author DELL_
 * @date 2021-08-31
 */


public class ArrayDemo {
    public static void main(String[] args) {

        // 静态初始化
        int[] arr = {1, 2, 3};

        System.out.println(arr);
        System.out.println(arr[0]);

        // 注意:
        // 索引越界 和 空指针异常  两种情况
        int[] arr2 = {0, 10, 50};

//        System.out.println(arr[4]);     // 这是错误的

        arr2 = null;
//        System.out.println(arr2[1]);   // 同样错误

    }
}