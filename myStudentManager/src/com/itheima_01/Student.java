package com.itheima_01;

/**
 * 学生
 *
 * @author DELL_
 * @date 2021-08-31
 */
public class Student {

    // 定义成员变量
    // 学号
    private String sid;
    // 姓名
    private String name;
    // 年龄
    private String age;
    // 居住地
    private String address;


    // 定义无参构造方法 --> 可以使用快捷键Ali+Insert   很强大的快捷键!!!
    // Alt+Insert能够根据变量选择
    public Student() {
    }

    // 定义带参构造方法
    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }



    // 同样的还能针对每个 成员变量 生成对应的get\set方法
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

