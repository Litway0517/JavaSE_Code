package com.myMath01;

public class MathDemo {
    public static void main(String[] args) {
        //public static int abs（int a）：返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("-------------");

        //public static double ceil（double a）：返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.34));       // 向上取整 --> 但是返回的是double类型值, 而不是int类型
        System.out.println(Math.ceil(12.56));
        System.out.println("-------------");

        //public static double floor（double a）：返回小于或等于参数的最大doubLe值，等于一个整数
        System.out.println(Math.floor(12.34));      // 向下取整 --> 但是返回的是double类型值, 而不是int类型
        System.out.println(Math.floor(11.99));
        System.out.println("-------------");

        //public static int round （float a）：按照四舍五入返回最接近参数的int
        System.out.println(Math.round(5.5F));
        System.out.println(Math.round(5.4F));
        System.out.println("-------------");

//        public static int max（int a，int b）：返回两个int值中的较大值
//        public static int min （int a，int b）：返回两个int值中的较小值（自学）
        System.out.println(Math.max(66, 88));
        System.out.println(Math.min(33, 55));
        System.out.println("-------------");

        //public static double pow（double a，double b）：返回a的b次幂的值
        System.out.println(Math.pow(2, 3));     // 返回的是double类型数据
        System.out.println("-------------");

        //public static double random（）：返回值为double的正值，[e.e，1.e）
//        System.out.println(Math.random());
        System.out.println((int) (Math.random()*100) + 1);

    }
}
