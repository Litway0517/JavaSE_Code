package com.itheima_01;

public class MethodDemo {
    public static void main(String[] args) {

        isEvenNumber();
        isEvenNumber02(6);

        int number = 10;
        isEvenNumber02(number);

    }


    // 方法必须先定义再调用, 不然报错.
    public static void isEvenNumber() {
        // 需求: 判断num是否为偶数
        int num = 10;
        num = 9;

        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


    // 方法改进
    public static void isEvenNumber02(int number) {
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }


}
