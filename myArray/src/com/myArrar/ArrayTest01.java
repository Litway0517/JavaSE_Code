package com.myArrar;

/**
 * 数组test01
 *
 * @author DELL_
 * @date 2021-08-31
 */
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
        System.out.println("--------");

        // 尝试修改
        int[] arr2 = arr;   // 让数组arr2也指向arr的内存区域
        arr2[0] = 111;
        arr2[2] = 333;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println("修改时, 直接修改的内存内容, 而arr[0]与arr2[0]指向的是同一块内容, 因此改变了arr[2]的值之后, arr[0]也是那个值");



    }
}
