package com.itheima_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Java中的异常被分为两大类：编译时异常和运行时异常，也被称为受检异常和非受检异常
    所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常都是编译时异常

    编译时异常：必须显示处理，否则程序就会发生错误，无法通过编译
    运行时异常：无需显示处理，可以和编译时异常一样处理
 */

public class ExceptionDemo03 {
    public static void main(String[] args) {

        // 运行异常
        method();

        method2();


    }

    // 编译时异常    使用try...catch处理异常  throws
    public static void method2() {
        String s = "2021-5-31";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    // 运行时异常RunTimeException
    public static void method() {
        int[] arr = {1, 97, 15};
        try {
            System.out.println(arr[3]);     // ArrayIndexOutOfBoundsException
            System.out.println(arr[2]);     // 出现错误之后, 后面的语句也不会执行. 
            System.out.println("这行?");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
