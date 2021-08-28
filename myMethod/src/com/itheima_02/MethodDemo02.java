package com.itheima_02;

public class MethodDemo02 {
    public static void main(String[] args) {

        boolean flag = isEvenNumber(152);
        System.out.println(flag);



    }

    public static boolean isEvenNumber(int number) {
        if(number%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
