package com.itheima_06;

/**
 * 新电话
 *
 * @author DELL
 * @date 2021/09/06
 */


public class NewPhone extends Phone{

    // 定义成员方法
    @Override       // 这个Override叫做注解, 能检测方法重写的正确性, 顾名思义, 就是子类的某个方法和父类的成员方法重名, 就是要重写父类的这个成员方法.
    public void call(String name) {
        System.out.println("开启视频功能");
        System.out.println("给" + name + "打电话");
        super.call(name);
    }
}
