package com.itheima_02;

import java.util.Date;

/*
    测试类
 */

/**
 * 日期演示
 *
 * @author DELL_
 * @date 2021-08-13
 */

public class DateDemo {
    public static void main(String[] args) throws Exception {

        // 创建日期对象
        // date --- string
        Date d1 = new Date();   // d1就是当前时间

        String s1 = DateUtils.dateToString(d1, "yyyy-MM-dd HH:mm:ss");
        System.out.println(s1);
        System.out.println("--------");

        String s2 = DateUtils.dateToString(d1, "yyyy年MM月dd日");
        System.out.println(s2);
        System.out.println("--------");

        // string --- date
        String s3 = "2050-12-13 12:13:25";
        Date d2 = DateUtils.stringToDate(s3, "yyyy-MM-dd HH:mm:ss");
        System.out.println(d2);


    }
}
