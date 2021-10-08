package com.itheima_06_Plus;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 反映test01
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    练习1：我有一个ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据，如何实现？
 */

public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {

        // 创建集合
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(10);
        array.add(20);
//        array.add("hello");

        System.out.println(array);
        System.out.println("--------");

        // 通过反射去完成 -> 获取class对象
        Class<ArrayList> arrayListReflect = ArrayList.class;

        // 获取构造方法 -> 创建实例对象
        Constructor<ArrayList> arrayCon = arrayListReflect.getConstructor();
        ArrayList arrayList = arrayCon.newInstance();

        // 获取成员方法 -> add
        Method addMethod = arrayListReflect.getMethod("add", Object.class);

        // 通过反射添加元素
        addMethod.invoke(arrayList, 10);
        addMethod.invoke(arrayList, 20);
        addMethod.invoke(arrayList, "林青霞");

        System.out.println(arrayList);

        System.out.println("反射面前所有对象都是公有的, 没有任何对象是隐私的. ");
    }
}
