package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {

        // 创建集合 不给出泛型
//        Collection c = new ArrayList();
        // 指明泛型
        Collection<String> c = new ArrayList<String>();

        // 添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100);     // 自动装箱  一旦上面的泛型指出了是String, 这里的int会在编译器报错, 反之不指出则不会.

        // 迭代器遍历
//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
//            Object i = it.next();
//            String s = (String)it.next();   // ClassCastException
            String s = it.next();
            System.out.println(s);
        }
    }
}
