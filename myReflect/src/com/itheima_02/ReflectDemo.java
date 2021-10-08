package com.itheima_02;

/**
 * 反映演示
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    三种方式获取CLass对象
    1：使用类的cLass属性来获取该类对应的CLass对象. 举例: Student.cLass将会返回student类对应的CLass对象

    2：调用对象的getClass()方法, 返回该对象所属类对应的CLass对象
        该方法是Object类中的方法. 所有的Java对象都可以调用该方法

    3：使用CLass类中的静态方法forName(String cLassName), 该方法需要传入字符串参数.
        该字符串参数的值是某个类的全路径, 也就是完整包名的路径

 */

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        // 第一种方式
        // 使用类的cLass属性来获取该类对应的CLass对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);     // class com.itheima_02.Student

        Class<Student> c2 = Student.class;
        System.out.println(c2 == c1);
        System.out.println("--------");


        // 第二种方式
        // 调用对象的getClass（）方法，返回该对象所属类对应的CLass对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3 == c1);
        System.out.println("--------");


        // 第三种方式
        // 使用CLass类中的静态方法forName（String cLassName）
        Class<?> c4 = Class.forName("com.itheima_02.Student");
        System.out.println(c4 == c1);

        /*
            这种方式, 能把com.itheima_02.XXX配置到配置文件中, 然后每次读取配置文件. 修改也只需要修改配置文件. 这样灵活性也很高.
         */


    }
}
