package com.itheima_03;

/**
 * 学生
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class Student {

    // 成员变量
    String name;
    //    int age;
    private int age;    // 实例对象不能直接访问age这个变量了. 我们增加get\set方法来提供获取与修改

    // getAge
    public int getAge() {
        return age;
    }

    // setAge
    public void setAge(int a) {
//        age = a;                // 类中的方法当然可以访问 成员变量
        if (a < 0 || a > 120) {
            System.out.println("输入数据有误");
        } else {
            age = a;
        }
    }

    // 定义方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
