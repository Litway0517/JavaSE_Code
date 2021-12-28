package com.itheima_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    测试类
 */

public class IteratorTest {
    public static void main(String[] args) {

        // 创建集合
        Collection<Student> c = new ArrayList<Student>();

        // 创建元素
        Student s1 = new Student("左冷禅", 31);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("刘正风", 32);

        // 添加元素
        c.add(s1);
        c.add(s2);
        c.add(s3);

        // 创建迭代器 --> 对c这个对象生成 迭代器. 调用方式c.iterator.
        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {

            Student s = it.next();
            System.out.println(s.getName() + ", " + s.getAge());
        }

    }
}
