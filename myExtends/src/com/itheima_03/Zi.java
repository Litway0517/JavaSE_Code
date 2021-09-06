package com.itheima_03;


/**
 * 子
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Zi extends Fu{
    /**
     * 年龄
     */
    public int age = 20;

    /**
     * 显示
     */
    public void show() {
        int age = 30;
        System.out.println(age);

        // 如果想访问本类的成员变量怎么办, 就是上面那个20的age --> 使用this关键字
        System.out.println(this.age);
        // 如果想访问父类的成员变量怎么办, 就是Fu类里面的age --> 就是使用super
        System.out.println(super.age);
    }
}
