package com.itheima_02;

/**
 * 字符串demo01
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class StringDemo01 {
    public static void main(String[] args) {

        // public String(); 创建一个空白字符串, 不包含任何内容
        String s1 = "";
        System.out.println("s1:" + s1);

        // public String(char[] chs); 根据字符数组的内容, 创建字符串
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        // public String(byte[] bys); 根据字节数据的内容, 创建字符串
        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        // 直接赋值创建字符串, 推荐使用这种即可
        String s4 = "abc";
        System.out.println("s4:" + s4);


    }
}
