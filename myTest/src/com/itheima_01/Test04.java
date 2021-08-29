package itheima_01;

/**
 * test04
 *
 * @author DELL_
 * @date 2021-08-29
 */


public class Test04 {
    public static void main(String[] args) {
        // 静态定义两个整数型数组
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};

        // 方法调用
        boolean flag = compare(arr1, arr2);
        System.out.println(flag);


    }

    // 判断两个数组是否相同
    public static boolean compare(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        // 最终返回true
        return true;
    }
}




