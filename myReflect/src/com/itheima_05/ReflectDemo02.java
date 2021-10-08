package com.itheima_05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反映demo02
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    练习：通过反射实现如下操作
        Students=new Student（）；
        s.method1（）；
        s.method2（“林青霞”）；
        String ss=s.method3（"林青霞"，30）；
        System.out.println（ss）；
        s.function（）；
 */

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        // 获取class对象
        Class<?> s = Class.forName("com.itheima_02.Student");

        // 获取成员方法
        Method m1 = s.getMethod("method1");

        // 获取无参构造方法
        Constructor<?> con = s.getConstructor();
        Object obj = con.newInstance();

        // 使得obj调用m1方法
        m1.invoke(obj);
        System.out.println("--------");

        Method m2 = s.getMethod("method2", String.class);
        m2.invoke(obj, "林青霞");
        System.out.println("--------");

        Method m3 = s.getMethod("method3", String.class, int.class);
        Object ss = m3.invoke(obj, "林青霞", 30);
        System.out.println(ss);
        System.out.println("--------");

        Method declaredFunc = s.getDeclaredMethod("function");
        declaredFunc.setAccessible(true);
        declaredFunc.invoke(obj);


        // 获取成员变量和成员方法
        Field ageField = s.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 33);

        Method method2 = s.getMethod("method2", String.class);
        method2.invoke(obj, "这里需要传入参数, 别忘了");

        System.out.println(obj);



    }
}
