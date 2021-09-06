package com.itheima_02;


/**
 * 子
 *
 * @author DELL_
 * @date 2021-09-06
 */


public class Zi extends Fu{
    // 身高
    public int height = 177;
//    public int age = 20;

    public void show() {
//        int age = 30;           // 变量的范围, 首先在方法内寻找, 再去本身的类内去寻找, 最后到父类去寻找
        System.out.println(age);
        System.out.println(height);
    }
}
