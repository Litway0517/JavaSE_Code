package com.itheima_05;

/*
    测试类
 */

public class AnimalDemo {
    public static void main(String[] args) {

        // 向上转型 --> 猫向上转成动物
        Animal a = new Cat();
        a.eat();
//        a.playGame();

        System.out.println("---------------------");

        // 向下转型 --> 动物转换成猫, 强制转换
        Cat c = (Cat) a;
        c.eat();
        c.playGame();


        System.out.println("---------------------");
        // 从猫转换成狗能行吗?
        a = new Cat();  // 向上转型为猫
        a.eat();

        a = new Dog();  // 再向上转型为狗
        a.eat();
        // 不行 --> ClassCastException --> 类转换异常
        // 想通过向下转型(狗强制转换为猫), 此时再想将a向下转型猫会出错
//        Cat c1 = (Cat) a;
//        c1.eat();
    }
}
