package com.itheima_05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反映demo01
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    反射获取成员方法并使用
 */

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取class对象
        Class<?> c = Class.forName("com.itheima_02.Student");

        /*
            获取多个成员方法 --> 返回一个数组
            Method[] getMethods​() 返回一个包含 方法对象的数组，
                方法对象反映由该 Class对象表示的类或接口的所有公共方法，包括由类或接口声明的对象以及从超类和超级接口继承的类.

                Method[] getDeclaredMethods​() 返回一个包含 方法对象的数组，
                方法对象反映由 Class对象表示的类或接口的所有声明方法，包括public，protected，default（package）访问和私有方法，
                但不包括继承方法。

         */
        Method[] methods = c.getMethods();
        System.out.println("按顺序输出methods中的方法");
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
        System.out.println("---------");
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("按序输出实际上和增强for循环, enhanced for是一样的");
        System.out.println("--------");


        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
        System.out.println("--------");


        /*
            获取单个方法 --> 返回是一个
            Method getMethod​(String name, Class<?>... parameterTypes) 返回一个 方法对象，
                该对象反映由该 Class对象表示的类或接口的指定公共成员方法.

            Method getDeclaredMethod​(String name, Class<?>... parameterTypes) 返回一个 方法对象，
                它反映此表示的类或接口的指定声明的方法 Class对象.
         */
        Method m = c.getMethod("method1");

        // 获取无参构造方法, 创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // 到Method中去找方法, 使得obj这个实例对象能够调用方法
        // Object invoke​(Object obj, Object... args) 在具有指定参数的指定对象上调用此 方法对象表示的基础方法
        // Object: 是invoke函数的返回值类型
        // obj: 是需要传入的对象
        // Object... args: 是需要传入的参数
        System.out.println("调用方法需要使用方法对象, 调用invoke()函数");
        m.invoke(obj);


    }
}



