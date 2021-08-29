package itheima_01;

public class Test01 {
    public static void main(String[] args) {
        // 需求: 输入星期数, 输出相应需要做的事情, 跑步, 游泳, 动感单车, 爬山, 慢走, 好好吃一顿.

        // 本测试略过, 也可以使用switch来实现

        // 需求2: 输出1-100以内的数目, 若包含7, 或者是7的倍数, 那么就过.
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if (ge == 7 || shi == 7 || i % 7 == 0) {
                System.out.println("过");
            } else {
                System.out.println("报数: " + i);
            }
        }

    }
}
