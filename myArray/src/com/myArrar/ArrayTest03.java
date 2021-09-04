package com.myArrar;

/**
 * 数组test03
 *
 * @author DELL_
 * @date 2021-08-31
 */


public class ArrayTest03 {
    public static void main(String[] args) {

        // int[] arr2 = new int[10];
        int[] arr = {12, 45, 98, 73, 60};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("数组arr的最大值为:" + max);



    }
}
