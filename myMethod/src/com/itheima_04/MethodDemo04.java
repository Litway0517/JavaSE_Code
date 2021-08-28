package com.itheima_04;

public class MethodDemo04 {
    public static void main(String[] args) {
        int[] arr = {1, 56, 22};
        System.out.println(arr[1]);

        change(arr);
        System.out.println(arr[1]);

    }

    public static void change(int[] arr) {
        arr[1] = 39;

    }

}
