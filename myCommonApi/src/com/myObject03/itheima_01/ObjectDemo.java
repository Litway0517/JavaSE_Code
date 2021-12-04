package com.myObject03.itheima_01;

/*
    Object类概述
        Object 是类层次结构的根，每个类都可以将 Object 作为超类。所有类都直接或者间接的继承自该类，
        换句话说，该类所具备的方法，所有类都会有一份
    查看方法源码的方式
        选中方法，按下Ctrl + B
    重写toString方法的方式
        1. Alt + Insert 选择toString
        2. 在类的空白区域，右键 -> Generate -> 选择toString
        toString方法的作用：
        以良好的格式，更方便的展示对象中的属性值

    建议所有类重写toString()方法.
 */

public class ObjectDemo {
    public static void main(String[] args) {

        // 实例化
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(31);
        System.out.println(s);  //com.itheima_01.Student@3f3afe78
        System.out.println(s.toString());

        /*public void println(Object x){
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }*/

        /*public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }*/

        /*public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/




    }
}
