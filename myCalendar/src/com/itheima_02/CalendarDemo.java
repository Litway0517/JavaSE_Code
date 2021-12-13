package com.itheima_02;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {

        // 创建日历对象
        Calendar cld = Calendar.getInstance();

        // 获取年月日字段
        int year = cld.get(Calendar.YEAR);
        int month = cld.get(Calendar.MONTH) + 1;
        int date = cld.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
        System.out.println("--------");

        // public abstract void add（int field，int amount）根据日历的规则，将指定的时间量添加或减去给定的日历字段
        cld.add(Calendar.YEAR, -1); // 相当于对cld日历对象中的year字段加上-1年.

        // cld.add实际上是指向内存中的同一块空间, 即cld本身已经发生改变了
        int year1 = cld.get(Calendar.YEAR);
        int month1 = cld.get(Calendar.MONTH) + 1;
        int date1 = cld.get(Calendar.DATE);
        System.out.println(year1 + "年" + month1 + "月" + date1 + "日");
        System.out.println("--------");

        // 需求: 10年后的5天前
        cld.add(Calendar.YEAR, 11);
        cld.add(Calendar.DATE, -5);
        int year2 = cld.get(Calendar.YEAR);
        int month2 = cld.get(Calendar.MONTH) + 1;
        int date2 = cld.get(Calendar.DATE);
        System.out.println(year2 + "年" + month2 + "月" + date2 + "日");
        System.out.println("--------");

        // public ﬁnal void set(int year,int month,int date) 设置当前日历的年月日
        cld.set(2048, 11, 11);
        int year3 = cld.get(Calendar.YEAR);
        int month3 = cld.get(Calendar.MONTH) + 1;   // 注意这里面加了一个月
        int date3 = cld.get(Calendar.DATE);
        System.out.println(year3 + "年" + month3 + "月" + date3 + "日");
        System.out.println("--------");
    }
}
