package com.itheima_03;

public class GenericDemo {
    public static void main(String[] args) {

        // 创建对象
        /*Generic<String> g = new Generic<String>();
        g.show("天津工业大学");

        Generic<Integer> g2 = new Generic<Integer>();
        g2.show(100);

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.show(true);*/

        Generic g = new Generic();
        g.show("天津工业大学");
        g.show(100);
        g.show(true);
        g.show(122.34);
    }
}
