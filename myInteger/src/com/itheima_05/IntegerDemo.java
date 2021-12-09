package com.itheima_05;

/*
    -   装箱：把基本数据类型转换为对应的包装类类型
    -   拆箱：把包装类类型转换为对应的基本数据类型
 */

public class IntegerDemo {
    public static void main(String[] args) {

        // -   装箱：把基本数据类型转换为对应的包装类类型
        Integer it = Integer.valueOf(100);  // 这就将 整数100 转换为了 Integer类型的100     这个动作叫做装箱
        Integer it2 = 100;      // 这个动作叫做自动装箱.

        //  -   拆箱：把包装类类型转换为对应的基本数据类型
        // it2 += 200;  因为it2是Integer类型数据. 而200是整数型数据
        it2 = it2.intValue() + 200;     // it2.intValue()叫做拆箱
        System.out.println(it2);

        it2 += 200; // 这一步中, 隐藏了自动拆箱和自动装箱
        System.out.println(it2);

        Integer ie = null;
        if (ie != null) {
            ie += 100;  // 报错, 因为ie为null, 若调用intValue会报错.NullPointerException
        }
        

    }
}
