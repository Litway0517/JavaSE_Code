package com.myArrar;

/**
 * 数组test02
 *
 * @author DELL_
 * @date 2021-08-31
 */


public class ArrayTest02 {
    public static void main(String[] args) {

        int[] arr = {15, 16, 11, 11, 5, 7};

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------" + "\n" + "for循环能够使用for增强");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
