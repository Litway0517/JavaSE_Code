package com.itheima_02;

/*
    public String getMessage（）：返回此throwable的详细消息字符串
    public String tostring（）：返回此可抛出的简短描述
    public void printStackTrace（）：把异常的错误信息输出在控制台
 */

/**
 * 异常demo02
 *
 * @author DELL_
 * @date 2021/12/15
 */
public class ExceptionDemo02 {
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
        } catch (ArrayIndexOutOfBoundsException e) {    // new ArrayIndexOutOfBoundsException()
            System.out.println("访问的数组信息不存在");   // 实际上得给用户一个界面提示, 但是现在还给不了
//            e.printStackTrace();
            System.out.println(e.getMessage());     // 异常的原因
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}


/*
    public Throwable() {

        private String detailMessage;

        public Throwable(String message) {
            detailMessage = message;
        }

        public String getMessage() {
            return detailMessage;
        }
    }
 */
