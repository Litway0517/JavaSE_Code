package com.itheima_06;

/*
    Arrays工具类中有一个静态方法：
        public static<T> List<T> asList（T..…a）：返回由指定数组支持的固定大小的列表
    List接口中有一个静态方法：
        public static <E>List<E> of（E..…elements）：返回包含任意数量元素的不可变列表
    Set接口中有一个静态方法：
        public static <E> Set<E> of（E...elements）：返回一个包含任意数量元素的不可变集合
 */

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * args demo02
 *
 * @author DELL_
 * @date 2021-07-23
 */

public class ArgsDemo02 {
    public static void main(String[] args) {

        // public static<T> List<T> asList（T..…a）：返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "Java");

//        list.add("javaee");     // UnsupportedOperationException, 不支持操作   因为修改了列表大小
//        list.remove("hello");   // UnsupportedOperationException: remove      同上
        list.set(1, "javaee");      // 可以操作     未修改列表大小

        System.out.println(list);
        System.out.println("--------");

        // public static <E>List<E> of（E..…elements）：返回包含任意数量元素的不可变列表
        // 接口是可以有静态方法的, 而且我们可以调用, 通过接口名调用
        List<String> list1 = List.of("hello", "world", "javaee");

        // add. remove. set方法均不能使用
//        list1.add("javase");    // UnsupportedOperationException
//        list1.add("hello");     // UnsupportedOperationException
//        list1.set(1, "index");  // UnsupportedOperationException

        System.out.println(list1);
        System.out.println("--------");

        // public static <E> Set<E> of（E...elements）：返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("hello", "world", "Javase", "hello");  // IllegalArgumentException: duplicate element: hello
        // set集合本身不能有元素重复, 而of是set接口的方法, 传入参数的时候必须按照规则, 不能有重复元素.
        Set<String> set = Set.of("hello", "world", "Javase");

        // 同样的, add. remove方法均不支持

        System.out.println(set);
    }
}
