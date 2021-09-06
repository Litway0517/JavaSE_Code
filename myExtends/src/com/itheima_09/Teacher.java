package com.itheima_09;

/**
 * 老师
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Teacher {

    // 定义成员变量
    private String name;
    private int age;

    // 无参构造方法 --> 必须写
    public Teacher() {
    }

    // 有参构造方法
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 定义成员方法
    public void teach() {
        System.out.println("教育每一位学员");
    }


}
