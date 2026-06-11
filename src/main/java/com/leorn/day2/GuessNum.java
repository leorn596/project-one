package com.leorn.day2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        //程序随机生成 1-100 数字，用户输入猜测，提示“大了”或“小了”，直到猜对
        Random r = new Random();
        int randomNum = r.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game:GuessNumber");
        System.out.println("Rule:input a int number between 1 to 100,just so");
        while (true) {
            System.out.println("Start!");
            int guessNum = 0;
            //如果需要容忍异常,catch的处理要scanner.nextInt();"清空输入",然后输出提示,continue;让while继续循环
            try{
                guessNum = scanner.nextInt();
            }catch(InputMismatchException e){
                throw new InvaildInputException("Invaild input type:please input int number between 1 to 100");
            }
            if(guessNum < randomNum){
                System.out.println("It's smaller,try again");
            }else if(guessNum > randomNum){
                System.out.println("It's bigger,try again");
            }else if(guessNum == randomNum){
                System.out.println("Bingo,you win!");
                break;
            }
        }
        scanner.close();
    }
}