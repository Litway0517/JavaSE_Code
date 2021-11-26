package com.itheima_03;

/*
   测试类
 */


public class AnimalDemo {
    public static void main(String[] args) {

        // 实现接口
        Jumping j = new Cat();
        j.Jumping();


        // 利用多态实现猫
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(3);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
//        a.jump();     // 编译错误, 因为Animal里面压根没有Jump方法

        System.out.println("------------");


        // 强制转换之后就能使用Jumping方法了
        Cat c = (Cat) a;
        c.Jumping();

        // 使用 含参构造方法创建对象
        a = new Cat("波斯", 3);
        System.out.println(a.getName() + ", " + a.getAge());

        System.out.println("------------");


        // 上面这些东西需要理解↑ ↑ ↑ ↑ ↑ ↑

        // 上面的几种初始化方法都不是在实际应用中的
        // 最直接的就是实例化Cat
        Cat cat = new Cat();
        cat.setName("波斯");
        cat.setAge(2);
        System.out.println(cat.getName() + ", " + cat.getAge());
        cat.Jumping();
        cat.eat();
        cat.show();

        System.out.println("------------");

        // 狗狗的实例化(含参)
        Dog puppy = new Dog("二哈", 3);
        System.out.println(puppy.getName() + ", " + puppy.getAge());
        puppy.eat();
        puppy.Jumping();
        puppy.show();




    }
}
