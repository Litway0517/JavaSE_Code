package com.itheima_07;

/**
 * λ演示
 *
 * @author DELL_
 * @date 2021-08-09
 */

/*
    Lambda表达式和匿名内部类的区别
 */

public class LambdaDemo {
    public static void main(String[] args) {

        // 尝试 --> 匿名内部类的方式调用以下方法
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类调用 形参为接口 的方法");
            }
        });

        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("匿名内部类调用 形参为抽象类 的方法");
            }
        });

        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("匿名内部类调用 形参为具体类 的方法");
            }
        });


        /*
            匿名内部类在调用方法时 --> 形参可以是 接口, 抽象类, 具体类 三种.
         */

        // 尝试 --> Lambda表达式调用以下方法
        useInter(() -> System.out.println("Lambda表达式调用  方法形参为接口 的方法"));

        // useAnimal(() -> System.out.println("Lambda表达式调用  方法形参为抽象类 的方法"));
        // useStudent(() -> System.out.println("Lambda表达式调用  方法形参为具体类 的方法"));

        /*
            Lambda表达式只能调用 方法形参为接口 的方法.
         */

        /*
            当接口中的抽象方法大于等于2个的时候, 也可以通过匿名内部类调用. 无非就是把两个或多个抽象方法都重写了. 但是Lambda就不可以.
         */


    }

    private static void useAnimal(Animal a) {
        a.method();
    }

    private static void useInter(Inter i) {
        i.show();
    }

    private static void useStudent(Student s) {
        s.study();
    }
}
