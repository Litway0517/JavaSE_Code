package com.itheima_05;

public class BasketballAthlete extends Athlete {

    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员, 学篮球技能");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员, 吃篮球运动员训练的东西");
    }
}
