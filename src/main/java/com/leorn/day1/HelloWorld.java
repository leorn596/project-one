package com.leorn.day1;
//缩进用四个空格
//大括号不换行，仅大括号行与上行缩进保持四个空格
//类名大驼峰，变量小驼峰--class HelloWorld，int helloWorld
//注释解释原因，而不是使用效果
//这个文件是我今天写的第一个java程序
//它是通过调用main函数来输出HelloWorld的一个程序
public class HelloWorld {
    public static void main(String[] args){
        String outputString1 = "helloWorld";
        String outputString2 = "Start learning java today";
        String outputString = outputString2 + "\n" + outputString1;
        System.out.println(outputString);
    }
}