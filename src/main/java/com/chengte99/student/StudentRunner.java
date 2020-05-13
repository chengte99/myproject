package com.chengte99.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();

        Student stu = new Student("kevin", 88, 99);
        stu.print();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input stu name:");
        String name = scanner.next();
        System.out.println("Please input stu eng:");
        int eng = scanner.nextInt();
        System.out.println("Please input stu math:");
        int math = scanner.nextInt();

        Student stu = new Student(name, eng, math);
        stu.print();
    }
}
