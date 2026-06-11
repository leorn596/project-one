package com.leorn.day2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        //分支结构
        {
            //if-else
            //原
            {
                // Scanner scannerTools = new Scanner(System.in);
                // String roadSign = scannerTools.next();
                // System.out.println("input here a section to continue(A,B,C,D)");
                // if (roadSign.equals("A")) {
                //     System.out.println("you choose A");
                // }else if(roadSign.equals("B")){
                //     System.out.println("you choose B");
                // }else if(roadSign.equals("C")){
                //     System.out.println("you choose C");
                // }else if(roadSign.equals("D")){
                //     System.out.println("you choose D");
                // }else{
                //     System.out.println("input error(please input A,B,C,D)");
                // }
            }
            //规范后
            {
                // Scanner scannerTools = new Scanner(System.in);
                // System.out.println("please choose A,B,C or D");
                // String roadSign = scannerTools.next();
                // scannerTools.close();
                // if ("A".equals(roadSign)) {
                //     System.out.println("you choose A");
                // }else if("B".equals(roadSign)){
                //     System.out.println("you choose B");
                // }else if("C".equals(roadSign)){
                //     System.out.println("you choose C");
                // }else if("D".equals(roadSign)){
                //     System.out.println("you choose D");
                // }else{
                //     throw new InvaildInputException("invaild input type(plese input A,B,C or D)");
                // }
            }
            //switch
            {
                // Scanner scannerTools = new Scanner(System.in);
                // System.out.println("please choose A,B,C or D");
                // String roadSign = scannerTools.next();
                // scannerTools.close();
                // switch (roadSign) {
                //     case "A":
                //         System.out.println("you choose A");
                //         break;
                //     case "B":
                //         System.out.println("you choose B");
                //         break;
                //     case "C":
                //         System.out.println("you choose C");
                //         break;
                //     case "D":
                //         System.out.println("you choose D");
                //         break;
                //     default:
                //         throw new InvaildInputException("invaild input type(please input A,B,C or D)");
                // }
            }
        }
        //循环结构
        {
            //for
            {
                // Scanner scannerTools = new Scanner(System.in);
                // System.out.println("please input a int number as row number");
                // int r = scannerTools.nextInt();
                // System.out.println("please input a int number as column number");
                // int c = scannerTools.nextInt();
                // scannerTools.close();
                // for(int i = 1;i <= r;i++){
                //     for(int j = 1;j <= c;j++){
                //         //实现上三角打印,可以用if限制条件割去下三角
                //         if(i <= j){
                //             System.out.print(i +"*"+ j +"="+ (i * j) + "\t");
                //         }
                //     }
                //     System.out.println();
                // }
            }
            //while
            //原
            {
                // Random r = new Random();
                // int randomNum = r.nextInt(100)+1;
                // Scanner scanner = new Scanner(System.in);
                // System.out.println("Game:GuessNumber");
                // System.out.println("Rule:input a int number between 1 to 100,just so");
                // while (true) {
                //     int guessNum = scanner.nextInt();
                //     if(guessNum < randomNum){
                //         System.out.println("It's smaller,try again");
                //         break;
                //     }else if(guessNum > randomNum){
                //         System.out.println("It's bigger,try again");
                //         break;
                //     }else if(guessNum == randomNum){
                //         System.out.println("Bingo,you win!");
                //         System.exit(0);
                //     }else{
                //         throw new InvaildInputException("Invaild input type:please input int number between 1 to 100")
                //     }
                // }
                // scanner.close();
            }
            //规范后
            {
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
    }
}