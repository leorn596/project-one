package com.leorn.day2;

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
            //
        }
    }
}