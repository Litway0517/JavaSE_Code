package com.itheima_02;

/**
 * 异常demo01
 *
 * @author DELL_
 * @date 2021/12/15
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {

        //
        System.out.println("start");
        method();
        System.out.println("end");


    }

    public static void method() {
        int[] arr = {1, 3, 3};
        // try...catch
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("访问的数组信息不存在");   // 实际上得给用户一个界面提示, 但是现在还给不了
            e.printStackTrace();
        }
    }
}
