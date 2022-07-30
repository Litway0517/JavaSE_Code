package com.itheima_01;


import java.util.ArrayList;

/**
 * 流演示
 *
 * @author DELL_
 * @date 2021-08-12
 */

/*
    需求：按照下面的要求完成集合的创建和遍历
        1：创建一个集合，存储多个字符串元素
        2：把集合中所有以“张”开头的元素存储到一个新的集合
        3：把“张“开头的集合中的长度为3的元素存储到一个新的集合
        4：遍历上一步得到的集合
 */

public class StreamDemo {
    public static void main(String[] args) {

        // 创建一个集合，存储多个字符串元素
        ArrayList<String> array = new ArrayList<String>();

        // 添加元素
        array.add("张曼玉");
        array.add("左冷禅");
        array.add("风清扬");
        array.add("张敏");
        array.add("小龙女");
        array.add("张无忌");

        ArrayList<String> zhangList = new ArrayList<String>();

        for (String s : array) {
            if (s.startsWith("张")) {
                zhangList.add(s);
            }
        }

        System.out.println("以张开头的元素集合: " + zhangList);
        System.out.println("--------");


        // 把“张“开头的集合中的长度为3的元素存储到一个新的集合
        ArrayList<String> threeList = new ArrayList<String>();

        for (String s : zhangList) {
            if (s.length() == 3) {
                threeList.add(s);
            }
        }

        System.out.println("以张开头的长度为3的元素集合: " + threeList);
        System.out.println("--------");


        // 上面仅三个需求就有很多代码 -> 采用stream流来优化
        array.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

        /*
            filter(Predicate<? super T> predicate)
                filter过滤器函数需要传入的就是一个Predicate谓词判断接口的实现类 正好能够用Lambda表达式实现 经过两次过滤再用forEach输出

            public abstract void forEach(java.util.function.Consumer<? super T> action)
                而forEach需要一个消费性接口 使用方法引用即可
        */

        // 代码理解: array是一个数组, 需要先生成stream流, 然后使用了两次过滤器, 依次过滤姓张的元素, 再过滤长度大于3的元素, 最后输出.

    }
}
