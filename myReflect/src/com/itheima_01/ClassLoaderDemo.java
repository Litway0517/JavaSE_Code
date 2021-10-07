package com.itheima_01;


/**
 * 类装入器演示
 *
 * @author DELL_
 * @date 2021-08-13
 */

/*
    CLassLoader中的两个方法
        static Classloader getSystemCLassLoader（）：返回用于委派的系统类加载器
        CLassLoader getParent（）：返回父类加载器进行委派

    ClassLoader就是类加载器, 本质就是把*.class文件从磁盘中加载到内存中
 */

public class ClassLoaderDemo {
    public static void main(String[] args) {

        // static Classloader getSystemCLassLoader（）：返回用于委派的系统类加载器
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println("系统加载类 -> " + c);      // AppClassLoader


        // CLassLoader getParent（）：返回父类加载器进行委派
        ClassLoader cParent = c.getParent();
        System.out.println("平台加载器 -> " + cParent);    // PlatformClassLoader

        // 查看cParent的父类
        ClassLoader grandFather = cParent.getParent();
        System.out.println("顶端加载器(系统 <- 平台 <- null) -> " + grandFather);    // null


    }
}
