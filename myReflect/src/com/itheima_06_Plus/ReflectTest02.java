package com.itheima_06_Plus;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 反映test02
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    练习2：通过配置文件运行类中的方法
        只需要修改配置文件config.ini即可
 */

public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 创建对象
        Student s = new Student();
        s.study();

        Teacher t = new Teacher();
        t.teach();

        System.out.println("--------");
        /*
            配置一个文件 -> 让调用者来决定该执行哪一个类 哪一个方法
                也就是说, 这里的Student和Teacher都是工具 -> 此时的工具概念上升到了类

            class.txt
            className=XXX
            methodName=xxx
         */

        // 加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("myReflect\\config.ini");
        // load就是把fr文件中的数据加载到了集合中 -> 为什么用properties因为它是集合, 有函数能够容易操作
        prop.load(fr);
        /*
            prop中的内容
                className=com.itheima_06
                methodName=study
         */
        System.out.println(prop);

        // 根据键值获取元素值
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");


        // 通过反射来使用
        Class<?> c = Class.forName(className);

        // 得到构造方法
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // 获得成员方法
        Method method = c.getMethod(methodName);

        // 执行方法
        method.invoke(obj);


    }
}




