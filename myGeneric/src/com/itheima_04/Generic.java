package com.itheima_04;

/*
    泛型接口
 */

public interface Generic<T> {
    // 接口中的方法, 全部都是抽象方法, 全部都是public修饰的. 默认为public abstract.
    public abstract void show(T t);

}
