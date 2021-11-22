package com.itheima_03;

/*
    动物操作类: 顾名思义, 就是说这个类是用来统一操作动物的
 */

public class AnimalOperator {

    /*
    public void useAnimal(Cat c) {
        c.eat();
    }

    public void useAnimal(Dog d) {
        d.eat();
    }
     */

    // 把上面两个方法统一, 无论是Cat还是Dog都是Animal
    public void useAnimal(Animal a) {
        a.eat();

//        a.lookDoor();     父类不能访问子类的特有功能, 这是弊端
    }
}
