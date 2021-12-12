package com.itheima_01;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {

        // 获取对象
        // 主要是这个getInstance方法, 是创建 当前日历实例的.
        Calendar c = Calendar.getInstance();    // 多态的形式, Calendar本身是抽象类, 不能实例化, 而getInstance是创建Calendar的子类或者孙类
        System.out.println(c);      // 月份字段是从0开始的
        System.out.println(c.getCalendarType());    // 返回日历类型

        // public int get​(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;  // 月是从0开始的, 因此+1
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");



    }
}
