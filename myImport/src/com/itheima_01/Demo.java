package com.itheima_01;

import cn.itcast.Teacher;       // 导包动作
// 这里面仅限于在同一个模块下, 不同模块的调用需要看下面的章节 --> 45与46标号

/*
    测试类
 */

public class Demo {
    public static void main(String[] args) {

        // 创建对象方法一
//        cn.itcast.Teacher t = new cn.itcast.Teacher();      // 前面要加上对应包名cn.itcast
        Teacher t = new Teacher();
        t.show();


        // 创建对象方法二
        Teacher t1 = new Teacher();
        t1.show();


    }
}
