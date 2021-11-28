package com.itheima_05;

public class BasketballCoach extends Coach {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练, 教培篮球运动员相关技能");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练随便吃东西");
    }

    // Diagram --> 图表
}
