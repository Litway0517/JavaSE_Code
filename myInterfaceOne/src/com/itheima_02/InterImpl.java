package com.itheima_02;

public class InterImpl implements Inter {

    public InterImpl() {
        /*
            这个super();是无参构造方法调用, 但是并不是调用的Inter这个接口里面, 因为接口本身不能写构造方法, 自然不能被调用.
            实际上是调用的Object这个类的无参构造方法(提示: Object这个类只有无参构造方法-->这也是为什么JVM会自动调用超类的无参构造方法)
         */
        super();
    }


    // 必须重写接口中的抽象方法
    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void method() {
        System.out.println("method");
    }
}




