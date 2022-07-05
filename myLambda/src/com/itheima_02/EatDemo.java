package com.itheima_02;

/**
 * 吃演示
 *
 * @author DELL_
 * @date 2021-08-08
 */

/*
    Lambda表达式的格式：（形式参数）一>（代码块）

    练习1：
        1：定义一个接口（Eatable），里面定义一个抽象方法：void eat（）；
        2：定义一个测试类（EatableDemo），在测试类中提供两个方法
        一个方法是：useEatable（Eatable e）
        一个方法是主方法，在主方法中调用useEatable方法
 */

public class EatDemo {
    public static void main(String[] args) {

        // useEatable（Eatable e）
        // 多态形式创建对象
        Eatable e = new EatableImpl();
        useEatable(e);


        // 匿名内部类方式
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一个苹果2...");
            }
        });


        // Lambda表达式方式
        useEatable( () -> {
            System.out.println("一天一个苹果3...");
        } );

    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
