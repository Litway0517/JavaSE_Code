package com.itheima_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 反映demo01
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    反射获取成员变量并使用
 */

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取class对象
        Class<?> c = Class.forName("com.itheima_02.Student");

        /*
            Field[] getFields​() 返回一个包含 Field对象的数组， Field对象反映由该 Class对象表示的类或接口的所有可访问的公共字段.
            Field[] getDeclaredFields​() 返回一个 Field对象的数组，反映了由该 Class对象表示的类或接口声明的所有字段.
         */

        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field);      // public java.lang.String com.itheima_02.Student.address
        }
        System.out.println("--------");

        Field[] declaredFields = c.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);      // 所有的Student的成员变量
        }
        System.out.println("--------");


        /*
            获取单个的成员变量
                Field getField​(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定公共成员字段。
                Field getDeclaredField​(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定声明字段。
         */
        Field addressField = c.getField("address");

        // 获取无参构造方法
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

//        obj.addressField = "西安";  // 错误

        /*
            Field中的方法
             Field提供有关类或接口的单个字段的信息和动态访问.
             void set​(Object obj, Object value) 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值.
         */
        // 设置obj的成员变量addressField赋值为西安
        addressField.set(obj, "西安");
        System.out.println(obj);


        // 使用顺序: 先获取class对象, 然后在获取成员变量getField, 此时返回一个Field类型的对象, 对这个对象再调用set方法.
    }
}
