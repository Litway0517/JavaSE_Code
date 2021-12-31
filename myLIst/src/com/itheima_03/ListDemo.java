package com.itheima_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
    需求：
        我有一个集合：List<string>list=new ArrayList<string>（）；
        里面有三个元素：list.add（"hello"）；list.add（"world"）；list.add（"java"）；
        遍历集合，得到每一个元素，看有没有“world”这个元素，如果有，我就添加一个"javaee”元素，请写代码实现
 */
public class ListDemo {
    public static void main(String[] args) {

        // 创建集合
        List<String> list = new ArrayList<String>();

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        // 遍历集合  需求
        Iterator<String> it = list.iterator();

        // 报错原因是因为: modCount这个变量和exceptedModCount这两个变量值不一样, 因为list调用add方法时, modCount值加一了.
        /*
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("world")) {        // ConcurrentModificationException: 并发修改异常(运行时异常)
                list.add("javaee");
                System.out.println(list);   // 在这里能输出的原因是因为, modCount这个变量还没有++
            }
        }
        */


        // 通过第二种方法for循环完成需求: 不报错
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);         // add放get方法并没有检查两个元素.
            if (s.equals("world")) {
                list.add("javaee");
            }
        }

        System.out.println(list);
    }
}
