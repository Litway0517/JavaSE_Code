package com.itheima_01;

import java.util.Date;

/*
    public Long getTime（）：获取的是日期对象从1970年1月1日ee:ee:ee到现在的毫秒值
    public void setTime（long time）：设置时间，给的是毫秒值
 */

public class DateDemo02 {
    public static void main(String[] args) {

        // public Long getTime（）：获取的是日期对象从1970年1月1日ee:ee:ee到现在的毫秒值
        Date d = new Date();
        System.out.println(d.getTime());    // 返回1970年1月1日0时 距离 当前时间 的毫秒数
        System.out.println(d);              // 输出当前时间
        System.out.println("-------");

        // public void setTime（long time）：设置时间，给的是毫秒值
        long time = System.currentTimeMillis();
        Date d2 = new Date();
        d2.setTime(time);           // 获取系统当前时间, 再设定
        System.out.println(d2);

        long date = 1000*60*60*60;
        Date d3 = new Date();
        d3.setTime(date);
        System.out.println(d3);


    }
}
