package com.myObject03.itheima_02;

/**
 * 学生
 *
 * @author DELL_
 * @date 2021/12/05
 */
public class Student {

    /**
     * 的名字
     */
    // 定义 成员变量
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 学生
     */
    public Student() {
    }

    /**
     * 学生
     *
     * @param name 的名字
     * @param age  年龄
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 得到的名字
     *
     * @return {@link String}
     */
    public String getName() {
        return name;
    }

    /**
     * 集名称
     *
     * @param name 的名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 让年龄
     *
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * 设定年龄
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * 字符串
     *
     * @return {@link String}
     */
    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    /**
     * =
     *
     * @param o o
     * @return boolean
     */
    // 重写 equals 方法 (不要hashcode方法)
    @Override
    public boolean equals(Object o) {

        /*
            this --- s1
            o    --- s2
         */

        // 先判断两个对象的地址值是否相同, 如果地址值都相同, 如是同一个数组, 那么返回true
        if (this == o) return true;

        // 判断传入的参数o是否为空, 如果是直接返回false.
        // getClass是获取了字节码, 简单理解, getClass()!=o.getClass()是为了比较, s1和s2是否是来自于同一个类
        if (o == null || getClass() != o.getClass()) return false;

        // 向下转型
        Student student = (Student) o;

        // 针对此类来说, 这是比较age字段是否相同
        if (age != student.age) return false;

        // 这是为了比较name字段是否相同, 其中, name != null, name非空, 则返回name.equals(student.name)
        // 即name非空, 则将name和o的name字段比较, equals这个方法是字符串的方法, 并不是我们重写的equals方法.
        // name.equals(student.name) 为真, 则返回true
        return name != null ? name.equals(student.name) : student.name == null;

    }

}
