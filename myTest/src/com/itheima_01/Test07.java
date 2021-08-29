package itheima_01;

import java.util.Scanner;

/**
 * test07
 *
 * @author DELL_
 * @date 2021-08-29
 */


public class Test07 {
    public static void main(String[] args) {

        // 动态数组定义
        int[] arr = new int[6];

        // 创建接收对象
        Scanner sc = new Scanner(System.in);

        // 循环接收数据 --> 可以输入1个数据回车一次, 也可以输入6个数据一次性回车一次.
        System.out.println("输入数组数值: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入第" + (i + 1) + "个评委的评分: ");
            arr[i] = sc.nextInt();
        }

        // 输出原数组
        printArray(arr);

        // 调用方法, 求均分
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);

        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("得分: " + avg);


    }


    // 遍历数组方法
    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println("]");
    }

    // 获取数组的最大值 --> 因为int的返回值只能返回一个数据, 要么返回数组, 你那样就能一次性返回最大最小值了
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        /*
            还一个写法
            for (int j : arr) {
                if (j > max) {
                    max = j ;
                }
            }
         */
        return max;
    }
    // TODO: 学习fetch是干嘛的

    // 获取数组最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 获取数组和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
