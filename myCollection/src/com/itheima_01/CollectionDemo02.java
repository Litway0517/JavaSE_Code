package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/*
    ColLection集合常用方法：
        boolean add（Ee）：添加元素
        boolean remove（Object o）：从集合中移除指定的元素
        void clear（）：清空集合中的元素
        boolean contains（Object o）：判断集合中是否存在指定的元素
        boolean isEmpty（）：判断集合是否为空
        int size（）：集合的长度，也就是集合中元素的个数
 */

public class CollectionDemo02 {
    public static void main(String[] args) {

        // 创建Collection对象
        Collection<String> c = new ArrayList<String>();

        // boolean add（Ee）：添加元素
        System.out.println(c.add("Hello"));
        System.out.println(c.add("World"));
        System.out.println(c.add("World"));     // ArrayList集合, 能够重复元素
        // add方法总返回true

        c.add("Hello");
        c.add("World");
        c.add("World");
        System.out.println(c);
        System.out.println("--------");

        // boolean remove（Object o）：从集合中移除指定的元素
        // 待考察 -> 通过remove("元素名称"), 移除元素时, 仅仅会移除第一个符合条件的元素, 然后就返回true, 否则就是集合种不存在该元素, 返回false
        System.out.println(c.remove("World"));
        // 移除不存在的元素会返回false, 可以用于一些条件判断
        System.out.println(c);
        System.out.println(c.remove("JavaSE"));
        System.out.println(c);
        System.out.println("--------");

        // void clear（）：清空集合中的元素
        c.clear();  // 清空
        System.out.println(c);
        System.out.println("--------");

        c.add("Hello");
        c.add("world");
        c.add("JavaSE");


        // boolean contains（Object o）：判断集合中是否存在指定的元素
        System.out.println(c.contains("Hello"));
        System.out.println("--------");

        // boolean isEmpty（）：判断集合是否为空
        System.out.println(c.isEmpty());
        System.out.println(c.size());

    }
}
