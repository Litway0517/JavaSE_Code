package com.itheima_01;

/**
 * 我的界面
 *
 * @author DELL_
 * @date 2021-08-09
 */


public interface MyInterface {

    public abstract void show1();

    public abstract void show2();

//    void show3();

    /*
        注意点:
        1. 如果MyInterface该接口需要升级 --> 出现show3()方法. 那么, 但凡是实现了MtInterface接口的类, 都还要必须重写show3()方法, 否则根据关系将会报错.
            但是我们只是需要部分类实现show3()方法即可, 或者说只是为了升级MyInterface这个类而已. 这样显然不利于我们的维护.

            第一种解决方式 -> 再创建一个接口: MyInterfaceSon继承自MyInterface. 而MyInterfaceSon中仅有show3()方法.
                            如果某个特类, 不仅需要实现show1和show2方法, 还需要实现show3方法, 那么使该类implements MyInterface, MyInterfaceSon 不过这样会导致继承体系很混乱, 不利于维护.
            第二种解决方式 -> public default 返回值 方法名() {...}  而且这个方法, 同样还能被其他实现类或者是继承接口重写.
     */


    // show3方法, 其他实现类一样能够调用 --> public修饰关键字可以省略
    public default void show3() {
        System.out.println("show3");
    }

//    default void show3() {
//        System.out.println("show3");
//    }
}
