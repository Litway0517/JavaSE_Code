package com.itheima_03_Plus;

import com.itheima_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反映demo01
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    反射获取构造方法并使用
 */

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        // 获取Class对象
        Class<?> c = Class.forName("com.itheima_02.Student");


        /*
            Constructor<?>[] getConstructors() 返回一个包含 Constructor对象的数组，
                Constructor对象反映了由该 Class对象表示的类的所有公共构造函数.
            这个返回的是一个数组, 包括的是构造方法数组, 且只能拿到公共构造函数. 即被public修饰的构造函数
         */

        Constructor<?>[] consPublic = c.getConstructors();
        for (Constructor con : consPublic) {
            System.out.println(con);
        }
        System.out.println("--------");

        /*
            Constructor<?>[] getDeclaredConstructors() 返回反映由该 Class对象表示的类声明的所有构造函数的
                Constructor对象的数组.
            这个能够获取所有的构造方法 -> 包括默认的和私有的
         */

        Constructor<?>[] consAllConstructor = c.getDeclaredConstructors();
        for (Constructor con : consAllConstructor) {
            System.out.println(con);
        }
        System.out.println("--------");


        /*
            Constructor<T> getConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，
                该对象反映由该 Class对象表示的类的指定公共构造函数.
            获取一个指定的构造函数(只能是公有), 这个方法需要传递参数.

            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，
                该对象反映由此 Class对象表示的类或接口的指定构造函数.
            获取一个指定的构造函数(可以是所有类型 public 默认 private三种权限的)

            参数: 一个类中可能有多个构造方法, 具体要获得哪一个, 由传入的参数决定.
                你要获得的构造函数的参数的个数和数据类型对应的字节码文件对象.
         */

        // 通过class对象获取其无参构造函数 -> 因为是无参, 所以不需要传递参数
        Constructor<?> con = c.getConstructor();

        // Constructor提供了一个类的单个构造函数的信息和访问权限.
        // T newInstance(Object... initargs) 使用由此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        Object o = con.newInstance();

        // 向下转型
        Student stu = (Student) con.newInstance();

        System.out.println(o + "\n" + stu);
        // Student{name='null', age=0, address='null'}
        // Student{name='null', age=0, address='null'}

        /*
            反射: 先获取了class对象c, c.getConstructor获取单个构造方法, 然后再调用newInstance方法创建一个对象.
         */


        // 获取含参的构造参数
        System.out.println("------------------------");
        System.out.println("带参构造方法");
        Constructor<?> conAll = c.getConstructor(String.class, int.class, String.class);
        Object obj = conAll.newInstance("张三丰", 71, "西安");

        System.out.println(obj);


    }
}








