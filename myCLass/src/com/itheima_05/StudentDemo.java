package com.itheima_05;

/**
 * 学生演示
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class StudentDemo {
    public static void main(String[] args) {

        // 创建对象
        Student s = new Student();
        s.show();

        // public Student(String name)
        Student s1 = new Student("林青霞");
        s1.show();
    }
}
