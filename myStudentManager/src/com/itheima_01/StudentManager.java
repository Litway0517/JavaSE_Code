package com.itheima_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理器
 *
 * @author DELL_
 * @date 2021-08-31
 */


public class StudentManager {
    public static void main(String[] args) {

        // 创建集合对象, 用于存储学生书局
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {

            // 用输出语句完成主界面编写
            System.out.println("---------学生管理系统---------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("输入选择: ");

            // Scanner输入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            // switch判断
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("使用结束");
//                    break;
                    System.exit(0);     // JVM退出
            }
        }

    }


    // 定义  添加学生信息  方法
    /*
    public static void addStudent(ArrayList<Student> array) {

        // 接收对象
        Scanner sc = new Scanner(System.in);

        // 提示信息
        System.out.println("输入学号: ");
        String sid = sc.nextLine();
        System.out.println("输入姓名: ");
        String name = sc.nextLine();
        System.out.println("输入年龄: ");
        String age = sc.nextLine();
        System.out.println("输入住址: ");
        String address = sc.nextLine();

        // 创建学生对象, 将键盘录入的数据传递给实体对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 将学生对象添加到array集合
        array.add(s);

        // 给出提示
        System.out.println("添加学生信息成功");
    }
    */
    // 定义  添加学生信息+  方法(包括学号重复情况)
    private static void addStudent(ArrayList<Student> array) {

        // 接收对象
        Scanner sc = new Scanner(System.in);

        // 提示信息
        String sid;

        // 循环执行
        while (true) {
            System.out.println("输入学号: ");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("该学号已经被占用, 再输入别的学号");        // 想重复执行这几行代码, 就放入while循环内, 无限循环配合break;
            } else {                                                    // while(true)...break;
                break;
            }
        }

        System.out.println("输入姓名: ");
        String name = sc.nextLine();
        System.out.println("输入年龄: ");
        String age = sc.nextLine();
        System.out.println("输入住址: ");
        String address = sc.nextLine();

        // 创建学生对象, 将键盘录入的数据传递给实体对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 将学生对象添加到array集合
        array.add(s);

        // 给出提示
        System.out.println("添加学生信息成功");
    }


    // 定义  查看所有学生信息  方法
    private static void findAllStudent(ArrayList<Student> array) {

        boolean empty = array.isEmpty();        // 当ArrayList为空时, isEmpty为true, 所以, 非空时要做的就是, 输出ArrayList的内容

        if (!empty) {
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t住址");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
            }
        } else {
            System.out.println("无信息, 先添加再查看");
        }

        // return;  这句话, 能够让这个方法提前结束, 然后不在向下执行. 注意方法返回类型为void类型.
        // 这也是一个方法

    }


    // 定义  删除学生信息  方法
    // 学号不存在的情况, 不能把相关的提示语句写在for循环里. 不然这样的提示语句会执行好几次
    /*
    public static void deleteStudent(ArrayList<Student> array) {

        // 提示信息
        System.out.println("输入要删除的学生学号信息: ");
        Scanner sc = new Scanner(System.in);

        System.out.println();
        String line = sc.nextLine();


        for (int i = 0; i < array.size(); i++) {
            // 进循环第一件事就是先用变量拿到 待遍历数据类型的内容
            Student s = array.get(i);
            if (s.getSid().equals(line)) {
                array.remove(i);
                System.out.println("删除学生信息成功");
                break;      // 一旦有 删除动作 了, 就不需要在想后面遍历了, 这样浪费资源, 耗时, 这个编程小细节需要记住.
            }
        }
    }
     */
    // 定义  删除学生信息+  方法(包括学号不存在的情况)
    private static void deleteStudent(ArrayList<Student> array) {

        // 提示信息
        System.out.println("输入要删除的学生学号信息: ");
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            // 进循环第一件事就是先用变量拿到 待遍历数据类型的内容
            Student s = array.get(i);
            if (s.getSid().equals(line)) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("该学生不存在");
        } else {
            array.remove(index);
            System.out.println("删除学生信息成功");
        }
    }


    // 定义  修改学生信息  方法
    /*
    public static void updateStudent(ArrayList<Student> array) {

        // 输入需要修改学生信息的学号
        Scanner sc = new Scanner(System.in);

        System.out.println("输入需要修改学生的学号: ");
        String sid = sc.nextLine();

        // 键入新的信息
        System.out.println("输入学生新姓名: ");
        String name = sc.nextLine();
        System.out.println("输入学生新年龄: ");
        String age = sc.nextLine();
        System.out.println("输入学生新居住地: ");
        String address = sc.nextLine();

        // 实例化新的对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 遍历搜索
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);

            if (student.getSid().equals(sid)) {
                array.set(i, s);
                break;      // 已经找到了相应的元素, 并且完成了修改, 因此不在向下面继续执行了.
            }
        }
        System.out.println("修改学生信息成功");

    }
    */
    // 定义  修改学生信息+  方法(包括学号不存在情况)
    private static void updateStudent(ArrayList<Student> array) {

        // 输入需要修改学生信息的学号
        Scanner sc = new Scanner(System.in);
        String sid;

        System.out.println("输入需要修改学生的学号: ");
        sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("该学号不存在");
            // 为了程序不再向下执行, 直接使用return返回
//            return;
        } else {
            // 键入新的信息
            System.out.println("输入学生新姓名: ");
            String name = sc.nextLine();
            System.out.println("输入学生新年龄: ");
            String age = sc.nextLine();
            System.out.println("输入学生新居住地: ");
            String address = sc.nextLine();

            // 实例化新的对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            array.set(index, s);
            System.out.println("修改学生信息成功");

        }
    }


    // 定义  判断学号是否被使用  方法(学号是不能重复的, 所以输入学号时需要先判断)
    private static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

}




