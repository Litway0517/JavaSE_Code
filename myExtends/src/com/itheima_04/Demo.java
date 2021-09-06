package com.itheima_04;

/**
 * 演示
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Demo {
    public static void main(String[] args) {

        // 创建对象
        Zi z = new Zi();

        System.out.println("------------");

        Zi z2 = new Zi(20);

        /*
            当初始化子类时, 会先初始化父类, 这是JVM机制. 因为子类有可能会用到父类的变量或者方法
         */
    }
}
