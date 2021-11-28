package com.itheima_02;

public class AnimalDemo {
    public static void main(String[] args) {

        // 创建对象
        // 向上转型
        Animal a = new Cat();
        AnimalOperator ao = new AnimalOperator();
        ao.useAnimal(a);


        Animal a2 = ao.getAnimal();
        // 简单理解就是: getAnimal是AnimalOperator的方法, 而ao是AnimalOperator的实例化对象, 所以这个对象能够调用getAnimal这个方法.
        // getAnimal方法返回的仍是一只猫, 即a2也能够调用猫类中的方法eat.
        a2.eat();
    }
}
