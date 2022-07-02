package com.itheima_04;

/*
   泛型接口的实现类
 */

public class GenericImpl<T> implements Generic<T> {

    // 无参构造方法
    public GenericImpl() {
    }

    // 注意: 我们一直没有明确出GenericImpl类中的T参数的类型. 即参数参数化
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
