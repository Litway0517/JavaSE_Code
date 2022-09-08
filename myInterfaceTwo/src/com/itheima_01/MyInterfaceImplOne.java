package com.itheima_01;

/**
 * 我的界面impl一
 *
 * @author DELL_
 * @date 2021-08-09
 */

public class MyInterfaceImplOne implements MyInterface {

    @Override
    public void show1() {
        System.out.println("One show1");
    }

    @Override
    public void show2() {
        System.out.println("One show2");
    }

    @Override
    public void show3() {
        System.out.println("虽然show3方法在父类接口MyInterface中是默认方法, 但是仍然能够被其实现类重写. 此时不需要加上default. " + "\n" +
                "而且, 对于show3这个父类接口中的方法, 可以选择重写, 也可以选择不重写. 不强制, 这样就很有灵活性. " + "\n" +
                "如果重写了这个show3方法, 那么就执行重写过的方法. " + "\n" +
                "如果没重写, 那么就执行父类接口中原来的默认方法的内容. " + "\n" +
                "如MyInterfaceOne和MyInterfaceTwo中的show3方法调用是不一样的. ");
    }
}
