package com.itheima_03_Plus;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反映demo02
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    通过反射实现如下的操作：
        Students=new Student（“林青霞”，3e，“西安"）；
        System.out.println（s）；
 */

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取class对象
        Class<?> c = Class.forName("com.itheima_02.Student");

        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        // 基本数据类类型, 如int, 也能够通过int.class获取class对象

        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);


    }
}
