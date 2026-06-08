package com.leorn.day2;

import java.util.Random;
import java.util.Scanner;

//缩进用四个空格
//大括号不换行，仅大括号行与上行缩进保持四个空格
//类名大驼峰，变量小驼峰--class HelloWorld，int helloWorld
//注释解释原因，而不是使用效果
public class DataType {
    public static void main(String[] args) {
//基本类型(Primitive)
{
    //int 可取+-21亿,默认0,占用4字节
    int zhengShu1 = 1;
    //byte 可取-128~+12,默认0,占用1字节
    byte zhengShu2 = 2;
    //short 可取-32768~+32767,默认0,占用2字节
    short zhengShu3 = 3;
    //long 可取"总之很大",默认0L,占用8字节
    long zhengShu4 = 4L;
    //float 可取+-3.4e38,默认0.0f,占用4字节
    float fuDianShu1 = 1.0f;
    //double 可取+-1.8e308,默认0.0,占用8字节
    double fuDianShu2 = 2.0;
    //char 可取1字符0~65535,默认\u0000(奇怪的看不懂),占用2字节
    char ziFu = 'a';
    //boolean 仅true"or"false,默认false,占用1字节
    boolean judgeMent = true;
    /*--------------------------------------------*/
    // System.out.println(zhengShu1);
    // System.out.println(zhengShu2);
    // System.out.println(zhengShu3);
    // System.out.println(zhengShu4);
    // System.out.println(fuDianShu1);
    // System.out.println(fuDianShu2);
    // System.out.println(ziFu);
    // System.out.println(judgeMent);
    /*--------------------------------------------*/
    //通过比较byte与double来判断赋值是否相等,2同理
    // System.out.println(zhengShu2 == fuDianShu2);
    // System.out.println(fuDianShu1 == zhengShu1);
    //如果布尔值为false返回true,如果布尔值为true,返回false
    // System.out.println(judgeMent == false);
    //判断a字符是否>1
    // System.out.println(ziFu > zhengShu1);
    // System.out.println(ziFu > fuDianShu1);
    //char 中字符'0' = int 中值48
        //字符'A' = int 中值65
            //字符'a' = int 中值97
    //尝试反向推导一下unicode值
    // int testNum = 0;
    // char outValue = (char)testNum;
    // System.out.println(outValue);
    //测试一下强制转换
    // float testNum = 1.666f;
    // int outValue = (int)testNum;
    // System.out.println(outValue);
    // 
    // int testNum1 = 64;
    // double testNum2 = 64.999;
    // char outValue1 = (char)testNum1;
    // char outValue2 = (char)testNum2;
    // System.out.println(outValue1 == outValue2);
    //看来浮点型强转成整数型在数学上会失去精度,但unicode字符转换不会

}
//引用类型(Reference)
{
    //我会用String制造两个对象,输出对象来实现day1的HelloWorld
    // String word1 ="Hello";
    // String word2 ="World";
    // System.out.println(word1 + " " + word2);
    // 比较方法与比较值的使用
    // String word1 = "Hello";
    // String word2 = word1;
    // word1 = "World";
    // System.out.println(word1.equals("Hello"));
    // System.out.println(word1 == "World");
    // System.out.println(word2 == "Hello");
    // System.out.println(word2.equals("World"));
    // System.out.println(word1.equals(word2));
    // System.out.println(word1 + " " + word2 + "!");
    //创建Scanner对象[熔炉],它连通着材料管道[标准输入流]
    // Scanner furnace =  new Scanner(System.in);
    //[熔炉]调用next方法获取originByte[原料],生产String对象[商品]([商品]被放在shelf[货架])
    // String shelf = furnace.next();
    //通过shelf可以访问到String对象的内容[商品]
    // System.out.println(shelf);
    /*------------------------------------*/
    // Random randomTool = new Random();
    //nextFloat()   只生产(0,1]之间的浮点数 nextDouble() 同理
    // Float randomNum = randomTool.nextFloat();
    // System.out.println(randomNum);
    
}
    }
}