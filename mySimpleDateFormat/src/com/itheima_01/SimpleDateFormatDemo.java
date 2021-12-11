package com.itheima_01;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
    构造方法：
        public SimpleDateFormat（）：构造一个simpleDateFormat，使用默认模式和日期格式
        public SimpleDateFormat（String pattern）：构造一个simpleDateFormat使用给定的模式和默认的日期格式

    格式化：从Date到string
        public final String format（Date date）：将日期格式化成 日期/时间字符串

    解析：从string到Date
        public Date parse（String source）：从给定字符串的开始解析文本以生成日期
 */

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {

        // 从Date到string
        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();      // 无参构造方法, 但不是我们想要的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("---------");

        // 从string到Date
        String date = "2021-07-16 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    // 这个模式串必须要和字符串匹配上
        Date d2 = sdf2.parse(date);
        System.out.println(d2);
    }
}
