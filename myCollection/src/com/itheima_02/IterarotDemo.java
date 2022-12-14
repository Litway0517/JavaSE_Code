package com.itheima_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
    Iterator：选代器，集合的专用遍历方式
        Iterator<E>iterator（）：返回此集合中元素的迭代器，通过集合的iterator（）方法得到
        迭代器是通过集合的iterator（）方法得到的，所以我们说它是依赖于集合而存在的

    Iterator中的常用方法
        E next（）：返回迭代中的下一个元素
        boolean hasNext（）：如果迭代具有更多元素，则返回 true
 */

/**
 * iterarot演示
 *
 * @author DELL_
 * @date 2021/12/29
 */
public class IterarotDemo {
    public static void main(String[] args) {

        // 创建集合
        Collection<String> c = new ArrayList<String>();

        // 添加元素
        c.add("Hello");
        c.add("World");
        c.add("JavaSE");

        // Iterator<E>iterator（）：返回此集合中元素的迭代器，通过集合的iterator（）方法得到
        Iterator<String> it = c.iterator();     // 这里的泛型String, 需要和集合中元素的类型一致

        // E next（）：返回迭代中的下一个元素
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());      // NoSuchElementException, 表示被请求的元素不存在

         */

        // boolean hasNext（）：如果迭代具有更多元素，则返回 true    判断还有没有元素
        while (it.hasNext()) {
            String s = it.next();       // 循环里面一定要先拿到元素再说, 不要直接用. 用变量s赋值一下.
            System.out.println(s);
        }


    }
}
