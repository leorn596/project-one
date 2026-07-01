package com.leorn.day4;
import java.util.ArrayList;

import com.leorn.day3.Student;
import com.leorn.day4.CollegeStudent;
public class SchoolTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student s1 = new CollegeStudent( 1, "zhangsan", 20, "man", 82, "Base math");
        Student s2 = new Student( 2, "lisi", 20, "man", 73);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(new Student(3,"wangwu",20,"man",70));
        studentList.add(new Student(4,"zhaoliu",21,"man",87));
        studentList.add(new Student(5,"qianqi",20,"man",89));

        System.out.println("");
        System.out.println("------------");
        System.out.println("StudentNum:" + studentList.size());
        System.out.println("------------");
        System.out.println("");
        System.out.println("------------");
        for(Student s : studentList){
            System.out.println(s.introduce());
            System.out.println("------------");
        }

        Student top = studentList.get(0);
        for(Student s : studentList){
            if (s.compareTo(top) < 0) {
                top = s;
            }
        }
        System.out.println("best score owner:" + "\n" + top.introduce());
    }
}