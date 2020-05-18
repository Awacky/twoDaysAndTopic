package org.lanqiao.lanqiao2017javaB._07日期问题;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/5/18 12:40
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String date = input.next();
//        忘了一件事情：在输入年份是正确的情况下，先判断A是否大于60，若大于一定是19**年，若小于再判断a是否在12和60之间，
//        若在，则a一定不是月份，再根据b判断b是否为月份。
        String a = date.substring(0,2);
        String b = date.substring(3,5);
        String c = date.substring(6,8);
//        如果a是年份
        if (Integer.parseInt(a) >= 60) System.out.println(1900 + Integer.parseInt(a) + "-" + b + "-" + c);
        if (Integer.parseInt(a) <= 59) System.out.println(2000 + Integer.parseInt(a) + "-" + b + "-" + c);
//        如果c是年份,有两种情况，a是月份或者b是月份
        if (Integer.parseInt(c) >= 60 &&Integer.parseInt(a)<=12 &&Integer.parseInt(b) <= 31){
            System.out.println(1900 + Integer.parseInt(c) + "-" + a + "-" + b);
        }
        if (Integer.parseInt(c) >= 60 &&Integer.parseInt(b)<=12 && Integer.parseInt(a) <= 31){
            System.out.println(1900 + Integer.parseInt(c) + "-" + b + "-" + c);
        }
        if (Integer.parseInt(c) <= 59 && Integer.parseInt(a)<=12 &&Integer.parseInt(b) <= 31){
            System.out.println(2000 + Integer.parseInt(c) + "-" + a + "-" + b);

        }
        if (Integer.parseInt(c) <= 59 &&Integer.parseInt(b)<=12 &&Integer.parseInt(a) <= 31){
            System.out.println(2000 + Integer.parseInt(c) + "-" + b + "-" + a);
        }
    }
}
