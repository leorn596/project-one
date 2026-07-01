package com.leorn.day3;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;
    private String gender;
    private int score;

    public Student(){

    }

    public Student(int id, String name, int age, String gender, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //从源头避免输入错误
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Input Wrong!Age not below zero");
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    //设置仅男/女
    public void setGender(String gender) {
        if ("man".equals(gender)) {
            this.gender = gender;
        }else if ("woman".equals(gender)) {
            this.gender = gender;
        }else{
            System.out.println("Input Wrong,Gender only could be man or woman");
            this.gender = null;
        }
    }

    public int getScore() {
        return score;
    }

    //score同age理
    public void setScore(int score) {
        if (score < 0) {
            System.out.println("Input Wrong!Score not below zero");
            this.score = 0;
        }else if (score > 100) {
            System.out.println("Input Wrong!Score not below zero");
            this.score = 0;
        }else{
            this.score = score;
        }
    }

    public String introduce(){
        return "Name:" + name +" "+ "Id:" + id + "\n" + "Gender:" + gender +" "+ "Age:" + age + " " + "\n" + "Score:" + score;
    }

    @Override
    public int compareTo(Student other) {
        // TODO Auto-generated method stub
        return(int)(other.score - this.score);
    }
}