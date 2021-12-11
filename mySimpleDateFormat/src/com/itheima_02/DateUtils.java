package com.itheima_02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    工具类

    构造方法私有
    成员方法静态
 */

/**
 * 日期跑龙套
 *
 * @author DELL_
 * @date 2021/12/11
 */
public class DateUtils {

    // 私有构造方法
    private DateUtils() {
    }

    // 定义方法 Date --- String
    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    // String --- Date
    public static Date stringToDate(String s, String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(s);
    }



}
