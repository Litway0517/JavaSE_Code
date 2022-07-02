package com.itheima_02;

public class Generic<T> {
    /**
     * t: 泛型类型, 不给出具体类型.
     * 当传入具体的数据类型时, T会转成相应的数据类型. T可以是任何引用类型.
     */
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
