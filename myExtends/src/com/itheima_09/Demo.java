package com.itheima_09;

/*
    测试类
 */

/**
 * 演示
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Demo {
    public static void main(String[] args) {

        // 创建对象, 测试
        Teacher t1 = new Teacher();
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("风清扬", 33);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();


    }
}
