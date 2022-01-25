package com.itheima_04;

/*
    测试类
 */

public class AnimalDemo {
    public static void main(String[] args) {

        // 创建方法, 多态
        Animal catKaFe = new Cat();
        catKaFe.setName("加菲");
        catKaFe.setAge(5);
        System.out.println(catKaFe.getName() + ", " + catKaFe.getAge());
        catKaFe.eat();

        System.out.println("---------");

        Animal catKaFe2 = new Cat("加菲", 3);
        System.out.println(catKaFe2.getName() + ", " + catKaFe2.getAge());
        catKaFe2.eat();


        // 狗类是一样的
    }
}
