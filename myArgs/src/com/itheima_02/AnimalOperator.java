package com.itheima_02;

import org.jetbrains.annotations.NotNull;

public class AnimalOperator {

    // 定义 方法
    public void useAnimal(@NotNull Animal a) {
        a.eat();
    }

    public Animal getAnimal() {
        Animal a = new Cat();

        return a;
    }

}
