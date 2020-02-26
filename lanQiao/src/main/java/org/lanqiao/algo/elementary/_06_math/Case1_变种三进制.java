package org.lanqiao.algo.elementary._06_math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/2/26 12:04
 */
/*
* 题目描述：
用天平称重时，我们希望用尽可能少的砝码组合称出尽可能多的重量。
如果只有5个砝码，重量分别是1，3，9，27，81
则它们可以组合称出1到121之间任意整数重量（砝码允许放在左右两个盘中）。

本题目要求编程实现：对用户给定的重量，给出砝码组合方案。
例如：
用户输入
* 5
* 9 - 3 - 1
* 用户输入：
* 19
* 27 - 9 + 1
*
* 要求程序输出的组合总是大数在前小数在后
* 可以假设用户的输入的数字符合范围 1 - 121*/
public class Case1_变种三进制 {

//    暴力解法
    private static void violenceSolve(int n){
//        int count = 0;
//        while (Math.pow(3,count) < n){
//            count++;
//        }
        int[] s = { 0 , 1, -1};
        for (int a = 0; a < 3;a++){
            for (int b = 0;b < 3; b++){
                for (int c = 0;c<3;c++){
                    for (int d = 0; d <3;d++){
                        for (int e = 0;e < 3;e++){
                            if (s[a]*81+s[b]*27+s[c]*9+s[d]*3+s[e]*1 == n){
                                StringBuilder sb = new StringBuilder();
                                if (s[a] == 1) sb.append("81");
                                if (s[b] == 1) sb.append("+27");
                                if (s[b] == -1) sb.append("-27");
                                if (s[c] == 1) sb.append("+9");
                                if (s[c] == -1) sb.append("-9");
                                if (s[d] == 1) sb.append("+3");
                                if (s[d] == -1) sb.append("-3");
                                if (s[e] == 1) sb.append("+1");
                                if (s[e] == -1) sb.append("-1");
                                if (sb.charAt(0) == '+' || sb.charAt(0) == '-') System.out.println(sb.substring(1));
                                else System.out.println(sb.toString());
                            }
                        }
                    }
                }
            }
        }
    }
//    使用进制的解法
//    先把输入的数进行转化，转成3进制
    private static void goodFunction(int n){
//        转成三进制
        final String x = Integer.toString(n,3);
//        把三进制数组进行翻转，这样的话，在处理后面不至于超出范围
        char[] arr = new StringBuilder(x).reverse().toString().toCharArray();
//        容器放处理之后的0 -1 1
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == '2'){
//                将-1插在开头
                list.add(0,-1);
                if (i == arr.length -1){
                    list.add(0,1);//最后一个字符进位
                }else {
                    ++arr[i+1]; //负责，对下一个数字加1
                }
            }else if(arr[i] == '3'){
                list.add(0,0);//插入0
//                更高位进1
                if (i == arr.length -1){
                    list.add(0,1);
                }else {
                    ++arr[i+1];
                }
            }else {
                list.add(0,arr[i]-'0');
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < list.size(); i++){
            if (list.get(i) == 1) sb.append("+").append((int)Math.pow(3,list.size() - i -1));
            if (list.get(i) == -1) sb.append("-").append((int)Math.pow(3,list.size() - i-1));
        }
        System.out.println(sb.substring(1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        goodFunction(n);
    }
}
