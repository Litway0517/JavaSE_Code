package com.itheima_02;

public class Teacher {
    /**
     * 年龄
     */
    private Integer age;

    /**
     * 老师
     */
    public Teacher() {
    }

    /**
     * 老师
     *
     * @param age 年龄
     */
    public Teacher(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
