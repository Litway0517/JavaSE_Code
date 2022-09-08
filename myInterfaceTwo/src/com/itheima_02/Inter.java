package com.itheima_02;

/**
 * 国际米兰
 *
 * @author DELL_
 * @date 2021-08-10
 */


public interface Inter {

    public abstract void show();

    default void method() {
        System.out.println("Inter接口中 默认方法执行了");
    }

    public static void test() {
        System.out.println("Inter接口中 静态当发执行了");
    }
}
