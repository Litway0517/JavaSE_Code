package com.itheima_04;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {

        // 测试ScoreException异常类
        Scanner sc = new Scanner(System.in);

        System.out.println("输入分数: ");
        int score = sc.nextInt();
        Teacher t = new Teacher();

        try {
            t.checkScore(score);    // 因为Teacher类throws了Exception类型的异常, 因此必须处理
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
