package com.itheima_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 除了演示
 *
 * @author DELL_
 * @date 2021/12/17
 */
public class ExceptionDemo {
    public static void main(String[] args) {

        // 调用
        System.out.println("start");
        method();     // 用throws, 如果出错了, 那么JVM会默认处理, 停止执行.

        try {
            method2();      // 即使method2()方法, 是使用throws避开的, 但是在实际调用时, 还是需要try...catch捕捉
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    // 编译时异常
    public static void method2() throws ParseException {
        String s = "2021-5-31";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(s);
        System.out.println(date);
    }


    // 运行时异常  如果仅仅用throws, 那么程序仍是不能向下正常执行的, 仅仅是抛出异常
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1, 97, 15};
        System.out.println(arr[3]);     // ArrayIndexOutOfBoundsException
        System.out.println(arr[2]);

    }
}
