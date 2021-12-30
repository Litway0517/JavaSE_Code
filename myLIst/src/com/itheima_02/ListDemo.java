package com.itheima_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        // 创建对象
        List<Student> list = new ArrayList<Student>();

        // 添加对象
        Student s1 = new Student("张曼玉", 31);
        Student s2 = new Student("王祖贤", 31);
        Student s3 = new Student("张 敏", 31);

        // 添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 遍历对象1
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            System.out.println(stu.getName() + ", " + stu.getAge());
        }

        System.out.println("--------");

        // 遍历对象2
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }


    }
}
