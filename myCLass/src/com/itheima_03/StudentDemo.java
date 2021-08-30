package com.itheima_03;

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

        // 赋值
        s.name = "林青霞";
//        s.age = 28;
//        s.setAge(30);
        s.setAge(-30);      // -30显然不正确, 但是我们能够在Student类中setAge方法中进行判断了.\


        // 调用方法
        s.show();
    }
}
