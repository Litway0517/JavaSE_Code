package com.itheima_01;

/**
 * 学生
 *
 * @author DELL
 * @date 2021/09/07
 */


public class Student {

    public String name;
    public int age;
//    public String university;
    public static String university;    // 这里面的university变量是共享的, 成员都能够访问该变量的值, 即只需要赋值一次, 后面的内容都是这个.


    // 定义 成员方法
    public void show() {
        System.out.println(name + "." + age + "," + university);
    }
}
