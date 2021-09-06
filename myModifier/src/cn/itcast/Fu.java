package cn.itcast;

public class Fu {


    // 定义 成员方法(测试权限修饰符)
    private void show1() {
        System.out.println("权限: private");
    }

    void show2() {
        System.out.println("权限: 默认");
    }

    protected void show3() {
        System.out.println("权限: protected");
    }

    public void show4() {
        System.out.println("权限: public");
    }

    // main入口, 测试
    public static void main(String[] args) {

        // 创建对象
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}










