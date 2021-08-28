package com.myArrar;

public class ArrayTest01 {
    public static void main(String[] args) {

        // 多个数组指向同一块内存
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 尝试修改
        int[] arr2 = arr;   // 让数组arr2也指向arr的内存区域
        arr2[0] = 111;
        arr2[2] = 333;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);



    }
}
