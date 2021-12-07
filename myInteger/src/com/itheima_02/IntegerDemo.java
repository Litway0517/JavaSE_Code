package com.itheima_02;

/*
    构造方法：
        public Integer（int value）：根据int 值创建Integer对象（过时）
        public Integer（String s）：根据 String值创建 Integer对象（过时）
    静态方法获取对象：
        public static Integer valueOf(int i )：返回表示指定的int 值的 Integer实例
        public static Integer valueOf(String s)：返回一个保存指定值的Integer 对象string
*/

/**
 * 整数演示
 *
 * @author DELL_
 * @date 2021/12/07
 */
public class IntegerDemo {
    public static void main(String[] args) {

        // 创建对象
        // public Integer（int value）：根据int 值创建Integer对象（过时）
        Integer i = new Integer(100);
        System.out.println(i);

        // public Integer（String s）：根据 String值创建 Integer对象（过时）
        Integer i2 = new Integer("200");
//        Integer i2 = new Integer("abc");    // NumberFormatException  只能是数字构成的字符串才可以解析
        System.out.println(i2);


        // 上面的方法过时了↑ ↑ ↑ ↑ ↑ ↑
        // 更换成以下的新方法
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

        Integer i4 = Integer.valueOf("200");
        System.out.println(i4);

//        Integer i4 = Integer.valueOf("abc");  // NumberFormatException
//        System.out.println(i4);
    }
}
