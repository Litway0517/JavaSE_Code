package com.itheima_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 反映demo02
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    练习：通过反射实现如下操作
    Students=new Student（）；
    s.name=“林青霞"；
    5.age=3e；
    s.address="西安”；
    System.out.println（s）；
 */

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取class对象
        Class<?> stu = Class.forName("com.itheima_02.Student");

        // 获取stu的无参构造方法 -> 并设置跳过检查
        Constructor<?> con = stu.getConstructor();
//        con.setAccessible(true);
        // 反射创建实例
        Object obj = con.newInstance();

        // 获取stu的成员变量
        Field stuName = stu.getDeclaredField("name");
        // 为name这个变量设置跳过检查, 因为是private
        stuName.setAccessible(true);
        stuName.set(obj, "林青霞");

        Field stuAge = stu.getDeclaredField("age");
        // 同样设置跳过检查
        stuAge.setAccessible(true);
        stuAge.set(obj, 30);

        Field addressField = stu.getField("address");
        addressField.set(obj, "西安");

        System.out.println(obj);
    }
}
