package com.itheima_05;

public class MethodTest05 {
    public static void main(String[] args) {

        int[] arr = {1, 98, 65, 33};
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {        // 如果是最后一个数据, 那么就不加  ", "
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + ", ");
            }

        }

        System.out.println("]");
    }

}
