package cn.itcast;

public class Zi extends Fu{
    public static void main(String[] args) {

        // 创建对象, 测试
        Zi z = new Zi();
//        z.show1();    // 这个show1()是Fu的成员方法, 因为其是private类型的, 因此访问不到.
        z.show2();
        z.show3();
        z.show4();
    }
}



