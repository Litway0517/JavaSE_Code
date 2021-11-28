package com.itheima_05;

public class PingPangCoach extends Coach implements SpeakEnglish {

    // 生成 构造方法
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    // 重写相关抽象方法  类 --> 接口

    @Override
    public void eat() {
        System.out.println("教练随便吃饭, 吃饱就行");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练到国外要说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教培乒乓球运动员");
    }
}
