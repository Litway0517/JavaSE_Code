package itheima_01;

import java.util.Scanner;

/**
 * test05
 *
 * @author DELL_
 * @date 2021-08-29
 */


public class Test05 {
    public static void main(String[] args) {

        // 需求: 输入数据, 查找其在数据中的位置, 如果不存在就返回-1
        int[] arr = {19, 28, 37, 46, 50};

        // 创建接收对象
        Scanner sc = new Scanner(System.in);

        // 接收数据
        System.out.println("输入待查找数据: ");
        int num = sc.nextInt();

        // 调用方法
        int index = getIndex(arr, num);
        System.out.println("index: " + index);



    }
    public static int getIndex(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                index = i;
                // if一般是配合break使用的, 当循环到符合条件的时i, 注意跳出循环.
                break;
            }
        }
        return index;
    }

}
