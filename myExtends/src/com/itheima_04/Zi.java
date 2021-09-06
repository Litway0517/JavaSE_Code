package com.itheima_04;

/**
 * 子
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Zi extends Fu{

    // 定义构造方法
    public Zi() {
//        super();
        super(20);
        System.out.println("Zi类中无参构造方法被调用");
    }

    public Zi(int age) {
//        super();
        super(20);
        System.out.println("Zi类中有参构造方法被调用");
    }
}
