package com.itheima_01;


/*
    需求: 通过方法实现 冒泡排序
 */


public class ArrayDemo {
    public static void main(String[] args) {

        // 静态初始化数组
        int[] arr = {185, -59, 335, 977, 1045, 415};
        System.out.println("排序之前的数组: " + arrayToString(arr));
        int[] arrSort = BubbleSort(arr);
        System.out.println("排序之后的数组: " + arrayToString(arrSort));


    }

    // 冒泡排序算法 实现
    // 冒泡排序一趟只能将一个元素放到最终位置, 因此需要n-1趟, 两个for循环才行
    public static int[] BubbleSort(int[] arr) {
        int temp;
        for (int x = 0; x < arr.length - 1; x++) {
            for (int i = 0; i < arr.length - x - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    // 规范化输出数组
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                sb.append(array[i]);
            } else {
                sb.append(array[i] + ", ");
            }
        }
        sb.append("]");

        String s = sb.toString();
        return s;
    }
}
