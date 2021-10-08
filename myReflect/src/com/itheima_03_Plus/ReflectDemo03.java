package com.itheima_03_Plus;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反映demo03
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*

 */

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取class对象
        Class<?> c = Class.forName("com.itheima_02.Student");

        Constructor<?> con = c.getDeclaredConstructor(String.class);

        /*
            因为itheima_02中的student是私有的构造方法 -> 不能访问.
            但是反射可以 -> 称为暴力反射

         */

        // 暴力反射
        // void setAccessible​(boolean flag) 将此反射对象的 accessible标志设置为指示的布尔值.  跳过访问检查
        con.setAccessible(true);

        Object obj = con.newInstance("林青霞");
        System.out.println(obj);

    }
}
