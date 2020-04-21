package org.lanqiao.algo.lanqiao_2019_JAVAb省赛._02不同的子串;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Awacky
 * @date 2020/4/21 21:05
 */
/*
* 一个字符串的非空子串是指字符串中长度至少为1 的连续的一段字符组成
的串。例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共7 个。
注意在计算时，只算本质不同的串的个数。
请问，字符串0100110001010001 有多少个不同的非空子串？

这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一
个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
*/
public class Main {
//    递归下去，无非就是两种情况，加零或者加一
    public static int subSum(String s){
        Set<String> set = new HashSet<>();
        for (int i = 0;i < s.length();i++){
            for (int j = i;j < s.length();j++){
//  返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾。
                set.add(s.substring(i,j+1));
            }
        }
        return set.size();
    }


    public static void main(String[] args) {
        String s2 = "abc";
        System.out.println(subSum(s2));
    }

//    力扣官方的解法一，这个是同一个长度的。
     public static int countBinarySubstrings(String s1){
        int[] groups = new int[s1.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1;i < s1.length();i++){
            if (s1.charAt(i - 1) != s1.charAt(i)){
                groups[++t] = 1;
            }else {
                groups[t]++;
            }
        }
         int ans = 0;
         for (int i = 1; i <= t; i++) {
             ans += Math.min(groups[i-1], groups[i]);
         }
         return ans;

     }
//     不同的子序列II

}
