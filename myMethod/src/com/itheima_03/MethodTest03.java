package com.itheima_03;

public class MethodTest03 {
    public static void main(String[] args) {
        System.out.println(compare(10, 20));
        System.out.println(compare((byte)1, (byte)10));
        System.out.println(compare((short)129, (short)129));
        System.out.println(compare(55555L, 55555L));



    }

    // int
    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    // byte
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    // short
    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    // Long
    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }



}
