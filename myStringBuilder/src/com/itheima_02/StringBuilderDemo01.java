package com.itheima_02;

/**
 * 字符串生成器demo01
 *
 * @author DELL_
 * @date 2021/12/07
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        // 创建对象
        StringBuilder sb = new StringBuilder();

        // 添加数据, 并返回数据本身 --> 就是返回自己, 即sb. 这里面, sb和sb2是指向的同一个内存区域, 同一个容器.
        // 因为这里不是new一个StringBuilder容器
        StringBuilder sb2 = sb.append("hello");

        System.out.println("sb: " + sb);
        System.out.println("sb2: " + sb2);
        System.out.println(sb == sb2);


        // 链式编程
        sb.append("Java").append("hello").append("itheima").append(100);    // sb.append()其本身还是对象, 那么就能够调用方法的, 链式调用.
        System.out.println("sb: " + sb);

        // 翻转
        sb.reverse();
        System.out.println("sb: " + sb);
    }
}
