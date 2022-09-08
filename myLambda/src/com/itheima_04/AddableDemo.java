package com.itheima_04;

/**
 * 可增加的演示
 *
 * @author DELL_
 * @date 2021-08-09
 */

/*
    Lambda表达式的格式：（形式参数）->（代码块）

    练习3：
    1：定义一个接口（Addable），里面定义一个抽象方法：int add（int x，int y）；
    2：定义一个测试类（AddableDemo），在测试类中提供两个方法
        一个方法是：useAddable（Addable a）
        一个方法是主方法，在主方法中调用useAddable方法
 */

public class AddableDemo {
    public static void main(String[] args) {

        // 定义一个接口（Addable），里面定义一个抽象方法：int add（int x，int y);
        // 定义一个测试类（AddableDemo），在测试类中提供两个方法


        // 匿名内部类调用
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        // Lambda表达式调用
        useAddable((int x, int y) -> {
            return x + y;

            // 最终的实现内容, 要看语句. 而不是仅仅看Addable中的抽象方法名字叫add. 但是方法名要和动作匹配 --> 见名知意
            // return x - y;
        });


    }

    // 一个方法是：useAddable（Addable a)
    // 记住: 这个useAddable, 它仅仅是一个函数, 仅仅是一个方法, 现在很多变量都是抽象的, 不要求有具体实现.
    private static void useAddable(Addable a) {

        // 这里面add方法并没有给出具体是怎么实现的, 将来我们传入Addable接口的实现类时, 需要重写Addable中add这个抽象方法, 那里会指明add方法的具体操作究竟是什么
        // 重写的add方法的具体内容就在上面的匿名内部类方式中 和 Lambda中了.
        int sum = a.add(10, 20);
        System.out.println("两数之和: " + sum);
    }

}
