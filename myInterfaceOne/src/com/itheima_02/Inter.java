package com.itheima_02;

public interface Inter {

    public int age = 20;
    public final int num = 30;

    // 上面两行等价于下面
    public static final int age1 = 20;
    public static final int num1 = 30;

    // 还等价于  --> 实际上, 接口里面的所谓的变量都是默认用 static和final两个关键字修饰的, 因此写不写都一样. 即所有变量都是常量, 都是静态.
    int age2 = 20;
    int num2 = 30;

    // 接口没有构造方法  --> 报错
//    public Jumping() {}

    // 接口中不能有方法
//    public void show() {}


    // 接口的方法只能是抽象方法
    public abstract void show();
    void method();  // 这里面省略了 public abstract
}
