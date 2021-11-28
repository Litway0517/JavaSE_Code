package com.itheima_05;

/*
    测试类
 */

public class PersonDemo {
    public static void main(String[] args) {

        // 这次直接创建 具体类对象 --> PingPangAthlete & BasketballAthlete & PingPangCoach & BasketballCoach

        // PingPangAthlete
        PingPangAthlete ppa = new PingPangAthlete();
        ppa.setName("许昕");
        ppa.setAge(35);
        System.out.println(ppa.getName() + ", " + ppa.getAge());
        ppa.eat();
        ppa.study();
        ppa.speakEnglish();

        System.out.println("----------");

        ppa = new PingPangAthlete("马龙", 37);
        System.out.println(ppa.getName() + ", " + ppa.getAge());
        ppa.eat();
        ppa.study();
        ppa.speakEnglish();

        System.out.println("----------");

        // BasketballAthlete
        BasketballAthlete ba = new BasketballAthlete();
        ba.setName("姚明");
        ba.setAge(41);
        System.out.println(ba.getName() + ", " + ba.getAge());
        ba.eat();
        ba.study();

        System.out.println("----------");

        ba = new BasketballAthlete("詹姆斯", 53);
        System.out.println(ba.getName() + ", " + ba.getAge());
        ba.eat();
        ba.study();

        System.out.println("----------");

        // PingPangCoach
        PingPangCoach ppc = new PingPangCoach("刘国梁", 55);
        System.out.println(ppc.getName() + ", " + ppc.getAge());
        ppc.eat();
        ppc.teach();
        ppc.speakEnglish();

        System.out.println("----------");

        // BasketballCoach
        BasketballCoach bc = new BasketballCoach("姚明的教练", 54);
        System.out.println(ba.getName() + ", " + bc.getAge());
        bc.eat();
        bc.teach();



    }
}





