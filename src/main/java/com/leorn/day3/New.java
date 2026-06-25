package com.leorn.day3;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Student student1 = new Student();
        // student1.setId(001);
        // student1.setName("ming");
        // student1.setGender("man");
        // student1.setAge(20);
        // student1.setScore(50);
        //小明自我介绍
        Scanner scannerTool = new Scanner(System.in);
        System.out.println("Input a StudentId");
        student1.setId(scannerTool.nextInt());
        System.out.println("Input a Stdudent Name");
        student1.setName(scannerTool.next());
        System.out.println("Input a Student Age");
        student1.setAge(scannerTool.nextInt());
        System.out.println("Input a Gender(man/woman)");
        student1.setGender(scannerTool.next());
        System.out.println("Input Student Score");
        student1.setScore(scannerTool.nextInt());

        scannerTool.close();

        System.out.println(student1.introduce());
    }
}
