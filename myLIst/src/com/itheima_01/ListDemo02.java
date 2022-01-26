package com.itheima_01;

import java.util.ArrayList;
import java.util.List;

/**
 * demo02列表
 *
 * @author DELL_
 * @date 2021/12/29
 */
public class ListDemo02 {
    public static void main(String[] args) {

        // 创建对象
        List<String> list = new ArrayList<String>();

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("javase");

        // 指定位置插入 -> 传入两个参数
        list.add(1, "sm");
        System.out.println(list);

        //指定为删除
        System.out.println(list.remove(1));     // 打印被删除的元素

        // 修改指定位置处的元素
        System.out.println(list.set(1, "sm"));

        // 获取指定位置元素
        System.out.println(list.get(1));

        // 输出
        System.out.println(list);
        System.out.println("--------");

        // 遍历集合 --> 通过get方法
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
