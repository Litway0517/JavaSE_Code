package com.itheima_03;

public interface Inter {
    public default void show1() {
        System.out.println("show1开始执行了");

        // System.out.println("初级工程师");
        // System.out.println("中级工程师");
        // System.out.println("高级工程师");

        show();
        // 默认方法也能够调用私有静态方法!
        method();
        System.out.println("show1结束执行");
    }

    public default void show2() {
        System.out.println("show2开始执行了");
        // System.out.println("初级工程师");
        // System.out.println("中级工程师");
        // System.out.println("高级工程师");
        show();
        System.out.println("show2结束执行");
    }

    /*
        写一个私有方法
     */
    default void show() {
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }


    public static void method1() {
        System.out.println("method1开始执行了");
        // System.out.println("初级工程师");
        // System.out.println("中级工程师");
        // System.out.println("高级工程师");
        method();
        System.out.println("method2结束执行");
    }

    public static void method2() {
        System.out.println("method1开始执行了");
        // System.out.println("初级工程师");
        // System.out.println("中级工程师");
        // System.out.println("高级工程师");
        method();
        System.out.println("method1结束执行");
    }

    /*
        写一个私有静态方法 --> 因为静态方法只能调用静态方法
     */
    public static void method() {
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }

}
