package org.lanqiao.algo.elementary._08dp;

import java.util.Scanner;

/**
 * @author Awacky
 * @date 2020/4/7 21:32
 */
/*
字典序最小问题

给一个定长为N的字符串S,构造一个字符串T,长度也为N。

起初，T是一个空串，随后反复进行下列任意操作

1. 从S的头部删除一个字符，加到T的尾部
2. 从S的尾部删除一个字符，加到T的尾部

目标是最后生成的字符串T的字典序尽可能小

1≤N≤2000
字符串S只包含大写英文字母

输入：字符串S
输出：字符串T

POJ - 3617 要求每80个字符换行输出
 */
//翻转字符串，然后比较添加。
//    字符串比较大小是compareTo()
//    string 与 StringBuilder的区别
public class Case06_字典序最小问题 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            sb.append(input.next());
        }

    }

    private static void f(String s){
        String s1 = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int cnt = 0;
        StringBuilder rs = new StringBuilder();
        while (rs.length() < n){
            if (s.compareTo(s1) <= 0){
                rs.append(s.charAt(0));
//                这个方法是，返回一个字符串的子串，子字符串以指定索引处的字符开始。
//                s,被添加，然后就少了一个子字符串。
                s = s.substring(1);
            }else {
                rs.append(s1.charAt(0));
                s = s.substring(1);
            }
//        字符串满80个就换行
            if (rs.length() % 80 == 0){
                System.out.println(rs.substring(cnt * 80,(cnt + 1) * 80));
                cnt++;
            }
        }
//        余数部分
        if (rs.length() > cnt * 80){
            System.out.println(rs.substring(cnt * 80));
        }
    }
//    进行处理
}
