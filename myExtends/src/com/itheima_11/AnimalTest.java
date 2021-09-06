package com.itheima_11;

/*
    测试类
 */

public class AnimalTest {
    public static void main(String[] args) {

        // 创建对象. 测试猫类, 这里面仅测试猫类
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catchMouse();

        System.out.println("-------------");

        Cat c2 = new Cat("加菲猫", 4);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.catchMouse();

        System.out.println("-------------");

        Dog d1 = new Dog();
        d1.setName("二哈");
        d1.setAge(7);
        System.out.println(d1.getName() + ", " + d1.getAge());
        d1.lookDoor();

        System.out.println("-------------");

        Dog d2 = new Dog("拉不拉多", 2);
        System.out.println(d1.getName() + ", " + d1.getAge());
        d2.lookDoor();

    }

}
