package com.itheima_01;

/**
 * 整数演示
 *
 * @author DELL_
 * @date 2021/12/07
 */
public class IntegerDemo {
    public static void main(String[] args) {

        // 需求: 判断一个数据是否在 int 范围内?
        // public static final int MAX_VALUE    使用static修饰, 那么能够直接使用类名访问
        // public static final int MIN_VALUE

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("----------");

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("----------");

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println("----------");

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("----------");

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);




    }
}
