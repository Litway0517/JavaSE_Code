package com.itheima_05;

/*

    增强for：简化数组和Collection集合的遍历
        实现Iterable接口的类允许其对象成为增强型for语句的目标
        它是J0k5之后出现的，其内部原理是一个Iterator迭代器
    格式：
        for（元素数据类型变量名：数组或者collection集合）（
        在此处使用变量即可，该变量就是元素
 */

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {

        // 增强for
        // 整数数组类型
        int[] arr = {1, 5, 19, 17, 31, 33};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("--------");

        // 字符串数组类型
        String[] strArray = {"hello", "world", "javase"};
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("--------");

        // 集合类型
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");

        for (String s: list) {
            System.out.println(s);
        }

        // 内部原理是一个Iterator的迭代器, 验证
        /*
        for (String s : list) {
            if (s.equals("world")){
                list.add("javaee");     // ConcurrentModificationException: 报错就说明是迭代器实现的.
            }
        }

         */



    }
}
