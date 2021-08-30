package com.itheima_02;

public class StudentDemo {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();

        System.out.println(s);
        System.out.println(s.name + "," + s.age);

        s.name = "徐明伟";
        s.age = 21;

        System.out.println(s.name + "," + s.age);

        s.study();
        s.doHomeWork();


    }
}
