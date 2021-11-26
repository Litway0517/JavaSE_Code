package com.itheima_03;

public class Dog extends Animal implements Jumping {

    // 无参构造方法
    public Dog() {
        super();
    }

    // 含参构造方法
    public Dog(String name, int age) {
        super(name, age);
    }

    // 重写继承自Animal抽象类中的eat抽象方法
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    // 重写实现接口Jumping中的Jumping抽象方法
    @Override
    public void Jumping() {
        System.out.println("狗经过训练会跳了");
    }


    // 定义 狗的特技
    public void show() {
        System.out.println("狗看大门");
    }

}
