package com.itheima_02;

public class MethodTest02 {
    public static void main(String[] args) {

        int numA = 10;
        int numB = 20;
        int max = getMax(numA, numB);
        System.out.println(max);


    }

    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
