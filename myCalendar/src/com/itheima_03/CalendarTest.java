package com.itheima_03;

import java.util.Calendar;
import java.util.Scanner;

/*
    需求：
        获取任意一年的二月有多少天
    思路：
        1：键盘录入任意的年份
        2：设置日历对象的年、月、日
        年：来自于键盘录入
        月：设置为3月，月份是从e开始的，所以设置的值是2
        日：设置为1日
        3：3月1日往前推一天，就是2月的最后一天
        4：获取这一天输出即可
 */

public class CalendarTest {
    public static void main(String[] args) {

        // 创建日历
        Calendar cld = Calendar.getInstance();

        Scanner sc = new Scanner(System.in);
        // 输入年份
        System.out.println("输入year = 2050待查询的年份: ");
        int year = sc.nextInt();

        // 设置成 某年3月1日
        cld.set(year, 2, 1);

        // 再减去一天
        cld.add(Calendar.DATE, -1);

        // 即得二月的最后一天是多少
        int date = cld.get(Calendar.DATE);
        System.out.println(year + "年的二月有 " + date + " 天");


    }
}
