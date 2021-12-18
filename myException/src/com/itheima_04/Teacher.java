package com.itheima_04;

public class Teacher {

    public void checkScore(int score) throws ScoreException {
        if (score<0 || score>100) {
//            throw new ScoreException();
            // throw关键字抛出异常
            throw new ScoreException("分数有误, 分数应该在0-100之间");     // 给出自己要抛出的异常信息
        } else {
            System.out.println("分数正常");
        }
    }
}
