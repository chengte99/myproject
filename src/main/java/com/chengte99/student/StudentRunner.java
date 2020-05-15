package com.chengte99.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();

        Student.pass = 50;
        Student stu = new Student("josh", 49, 59);
        Student stu1 = new Student("jane", 40, 60);
        Student stu2 = new Student("eric", 23, 56);

        GraduateStudent gstu = new GraduateStudent("jack", 67, 69, 75);
        gstu.print();

        stu.print();
        stu1.print();
        stu2.print();

        com.chengte99.kotlin.Student.Companion.setPass(50);
        com.chengte99.kotlin.Student stu3 = new com.chengte99.kotlin.Student("tony", 56, 61);
        stu3.print();

//        System.out.println("Highest score: " + stu.highest());
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
