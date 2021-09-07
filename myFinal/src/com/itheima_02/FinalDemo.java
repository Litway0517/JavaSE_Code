package com.itheima_02;

/*
    测试类
 */

public class FinalDemo {
    public static void main(String[] args) {

        // final修饰基本类型变量
        final int age = 20;
//        age = 100;
        System.out.println(age);

        // final修饰引用类型的变量
        final Student s = new Student();        // 这里final修饰的实际上是s, 而s是一个地址值, final是为了修饰s地址值不能变的
        s.age = 100;        // 但是这个s.age是内容, 是可以变得
//        s = new Student();  // 这行代码就不正确, 因为本意是想重新给s赋值, 但是s被final固定这, 是不能重新改变地址的.
        System.out.println(s.age);


    }
}
