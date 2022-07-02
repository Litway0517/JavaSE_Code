package com.itheima_03;

/*public class Generic {

    public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer i) {
        System.out.println(i);
    }

    public void show(Boolean b) {
        System.out.println(b);
    }


}*/


/**
 * 通用的
 *
 * @author DELL_
 * @date 2021-07-22
 */

// 改进泛型类
/*public class Generic<T> {
    public void show(T t) {
        System.out.println(t);
    }
}*/

// 泛型方法
public class Generic {

    // 当对象调用show方法是参数类型确定, 传入什么样的数据, 那么T就是什么样的数据类型
    public <T> void show(T t) {
        System.out.println(t);
    }
}

