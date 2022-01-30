package com.itheima_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 列表演示
 *
 * @author DELL_
 * @date 2022/01/01
 */
public class ListDemo {
    /**
     * 主要
     *
     * @param args arg游戏
     */
    public static void main(String[] args) {

        // 创建对象
        List<String> list = new ArrayList<String>();

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("javase");

        // 创建列表迭代器
        ListIterator<String> lit = list.listIterator();

        // 向后遍历
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("--------");

        // 向前遍历
        while (lit.hasPrevious()) {
            String s = lit.previous();
            System.out.println(s);
        }
        System.out.println("--------");

        // 在迭代的过程中添加元素
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("world")) {
                lit.add("javaee");
                // 这里面, listIterator调用add函数之后, 就expectedModCount = modCount了.
                // 因此, 在进行hasNext时, 就不会报错.
            }
        }
        System.out.println(list);



    }
}
