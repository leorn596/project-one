package com.leorn.day4;
import com.leorn.day3.Student;
public class CollegeStudent extends Student{
    private String major;

    public CollegeStudent(){
        super();
    }

    public CollegeStudent(int id, String name, int age, String gender, int score, String major){
        super(id, name, age, gender, score);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String introduce() {
        // TODO Auto-generated method stub
        return super.introduce() + " " + "Major:" + major;
    }
}