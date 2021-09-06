package com.itheima_10;

public class Teacher extends Person{

    // 无参构造方法
    public Teacher() {}

    // 带参构造方法
    public Teacher(String name, int age) {
//        this.name = name;
//        this.age = age;
        super(name, age);       // super是调用父类构造方法的意思, 然后, 传入的参数为name和age.
    }

    // 定义特有成员方法
    public void teach() {
        System.out.println("教育每一位学员");
    }
}
