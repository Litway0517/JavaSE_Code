package com.itheima_05;

public class PingPangAthlete extends Athlete implements SpeakEnglish{

    // 生成 构造方法
    public PingPangAthlete() {
    }

    public PingPangAthlete(String name, int age) {
        super(name, age);
    }

    // 重写类的抽象方法
    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃, 训练的专用配餐");
    }

    // 重写类的抽象方法
    @Override
    public void study() {
        System.out.println("乒乓球运动员学技能");
    }

    // 重写接口的抽象方法
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员到国外需要说英语");
    }
}
