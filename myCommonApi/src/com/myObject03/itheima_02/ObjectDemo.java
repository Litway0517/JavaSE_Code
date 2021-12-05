package com.myObject03.itheima_02;

public class ObjectDemo {
    public static void main(String[] args) {

        // 创建对象
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(30);


        // 需求: 比较两个对象的内容是否相同
        System.out.println(s1 == s2);   // false, 两个地址值是不一样的, 因此不同(这里面比较的是地址, 并不是内容)

//        System.out.println(s1.equals(s2));      // false
        // 查阅源码
        /*
        public boolean equals(Object obj) {
            // this = s1
            // obj = s2
            return (this == obj);
        }
         */
        // equals函数, 仍是将s1的地址值与s2进行比较的. 需要重写equals

        // 重写之后的结果
        System.out.println(s1.equals(s2));




    }
}
