package com.itheima_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    工具类

    构造方法私有
    成员方法静态
 */

public class DateUtils {

    // 私有构造方法
    private DateUtils() {
    }

    // 定义方法 Date --- String
    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }

    // String --- Date
    public static Date stringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(s);
        return date;
    }



}
