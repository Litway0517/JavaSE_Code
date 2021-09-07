package com.itheima_01;

public class Zi extends Fu {    // 这里不能在继承Fu类了, 因为Fu类被标记为了final

    // 定义 成员变量和成员方法
    private final int age = 20;

    public void show() {
//        age = 100;        // 同样因为上面的age被final修饰了, 变为常量了, 不能再修改了.
        System.out.println(age);
    }




    // 定义 成员方法 --> 重写method方法   实际上报错, 因为Fu类中的method()方法是final修饰, 因此不能被重写. final标记为最终状态.
//    @Override
//    public void method() {
//        System.out.println("Zi method");
//    }
}
