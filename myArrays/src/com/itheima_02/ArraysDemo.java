package com.itheima_02;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        // 定义静态数组
        int[] arr = {1, 56, 33, 97, 61, 59, 87, 111, 5631, 2719};
        System.out.println("数组排序前: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("数组排序后: " + Arrays.toString(arr));

        // Arrays实际上是有一个构造方法的, 但是是private修饰的, 禁止构造Arrays. 避免出错. Math System这几个类都是这样的.
        // JVM会自动给类创建一个无参构造方法, 不过这个自动创建的是用public修饰的, Arrays为了避免这种情况, 就用private重写了默认构造方法

        // Suppresses default constructor, ensuring non-instantiability.
        // private Arrays() {}
    }
}
