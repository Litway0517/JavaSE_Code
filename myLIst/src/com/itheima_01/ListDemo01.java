package com.itheima_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * demo01列表
 *
 * @author DELL_
 * @date 2021/12/29
 */
public class ListDemo01 {
    public static void main(String[] args) {

        // 创建集合对象
        List<String> list = new ArrayList<String>();

        // 添加元素
        list.add("Hello");
        list.add("World");
        list.add("JavaSE");
        list.add("World");

        // 输出元素
        System.out.println(list);

        // 迭代器遍历 --> 不同的集合应该有不同的迭代器, 因此肯定是用集合变量的名称调用iterator方法.
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }


    }
}
