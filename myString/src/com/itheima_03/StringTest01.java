package com.itheima_03;

import java.util.Scanner;

/**
 * 字符串test01
 *
 * @author DELL_
 * @date 2021-08-30
 */


public class StringTest01 {
    public static void main(String[] args) {
        // 设置账户和密码
        String username = "itheima";
        String password = "czbk";

        for (int i = 0; i < 3; i++) {

            // 键盘键入需要登陆的账户和密码
            Scanner sc = new Scanner(System.in);

            System.out.println("输入账户: ");
            String name = sc.nextLine();

            System.out.println("输入密码: ");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功");
                // 通常来说if 和 break需要搭配使用, 一旦满足条件了, 就退出循环
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("账户被锁定, 请联系管理员");
                } else {
                    System.out.println("登陆失败, 还有" + (2 - i) + "次登陆机会");
                }
            }
        }
    }
}
