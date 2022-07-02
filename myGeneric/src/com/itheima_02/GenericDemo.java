package com.itheima_02;

/**
 * 通用的演示
 *
 * @author DELL_
 * @date 2021-07-22
 */

public class GenericDemo {
    public static void main(String[] args) {

        // 创建对象
        Student s = new Student();
        s.setName("林青霞");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
//        t.setAge("30");   // 因为Teacher类中age只能是Integer类型
        System.out.println(t.getAge());
        System.out.println("--------");

        // 通过泛型类来实现
        Generic<String> g1 = new Generic<String>();
        g1.setT("林青霞");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(29);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}
