package com.itheima_01;

/*
    多态：
    同一个对象，在不同时刻表现出来的不同形态
    举例：猫:
        我们可以说猫是猫：猫 cat = new 猫();
        我们也可以说猫是动物：动物 animal= new 猫();
        这里猫在不同的时刻表现出来了不同的开形态，这就是多态
    多态的前提和体现
        有继承/实现关系
        有方法重写
        有父类引用指向子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {

        // 创建对象
        // 有父类引用指向子类对象
        Animal a = new Cat();       // 这个就叫做多态, 左面为父类引用, 右面是子类
        a.eat();

    }
}
