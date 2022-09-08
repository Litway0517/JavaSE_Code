package com.itheima_05;

/**
 * λ演示
 *
 * @author DELL_
 * @date 2021-08-09
 */

/*
    Lambda表达式的省略模式
 */

public class LambdaDemo {
    public static void main(String[] args) {

        // 调用方法
        // 完整模式的Lambda表达式
        useAddable((int x, int y) -> {
            return x + y;
        });
        System.out.println("--------");

        // 参数的类型能够省略
        useAddable((x, y) -> {
            return x + y;
        });

        // 但是, 多个参数时, 不能只省略一个
//        useAddable((x, int y) -> {
//            return x + y;
//        });


        System.out.println("--------");

        useFlyable((String s) -> {
            System.out.println(s);
        });

        // 省略String类型
        useFlyable((s) -> {
            System.out.println("省略参数类型: " + s);
        });

        // 当参数有且仅有一个时,  小括号也可以省略
        useFlyable(s -> {
            System.out.println("有且仅有一个参数, 省略参数的类型和小括号: " + s);
        });

        // 如果代码块只有一条语句, 那么大括号和该条语句的分号也能省略
        useFlyable(s -> System.out.println("单条语句情况, 省略大括号和分号: " + s));

        // 如果代码块内的语句只有一条, 而且这条语句含有return, 那么省略大括号和分号时, 还需要把return也省略掉
        useAddable((x, y) -> x + y);

    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽, 晴空万里");
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

}
