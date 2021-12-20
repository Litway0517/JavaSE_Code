package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 收集demo01
 *
 * @author DELL_
 * @date 2021/12/20
 */
public class CollectionDemo01 {
    public static void main(String[] args) {

        // 创建Collection对象
        // Collection是接口, 不能直接实例化, 因此, 这里是通过 实现了Collection这个接口的类ArrayList实例化的.
        Collection<String> c = new ArrayList<String>();

        // 添加元素
        c.add("Hello");
        c.add("World");
        c.add("JavaSE");
        System.out.println(c);
    }
}
