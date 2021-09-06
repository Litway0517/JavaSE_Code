package com.itheima_08;

/*
public class Son extends Father. Mather{
}
    // 一个类不能继承多个类
 */

/**
 * 儿子
 *
 * @author DELL
 * @date 2021/09/06
 */


public class Son extends Father {

    // 重写 方法
    @Override
    public void smoke() {
        System.out.println("儿子学会了抽烟");
    }

    @Override
    public void drink() {
        System.out.println("儿子学会了喝酒");
    }

    // 简单测试
    public static void main(String[] args) {

        // 创建对象
        Son s = new Son();
        s.smoke();
        s.drink();

        /*
            静态方法(此处的main函数)也能够调用非静态方法, 但是需要先实例化创建对象, 即s这个实例对象
         */
        s.personalSkill();
    }

    private void personalSkill() {
        System.out.println("儿子还学会了烫头, 愿为曹家世代抽烟喝酒烫头~");
    }
}
